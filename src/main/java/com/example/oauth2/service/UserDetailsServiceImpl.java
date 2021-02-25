package com.example.oauth2.service;

import com.example.oauth2.exception.LogicException;
import com.example.oauth2.model.Role;
import com.example.oauth2.model.User;
import com.example.oauth2.repository.RoleRepository;
import com.example.oauth2.repository.UserRepository;
import com.example.oauth2.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByName(s);
        if (user == null) {
            new LogicException(Constant.LogicReject.USER_NOT_FOUND.getKey(), Constant.LogicReject.USER_NOT_FOUND.getKey());
        }
        Collection<SimpleGrantedAuthority> grantedAuthorities = new ArrayList<>();
        List<Role> roleList = roleRepository.findAllByUser(user.getUserId());
        for (Role role : roleList) {
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getKey()));
        }
        return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), grantedAuthorities);
    }
}
