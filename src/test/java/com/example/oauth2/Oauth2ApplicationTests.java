package com.example.oauth2;

import com.example.oauth2.model.User;
import com.example.oauth2.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.UUID;

@SpringBootTest
class Oauth2ApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Test
    void contextLoads() {
        User user = new User();
        user.setUserId(UUID.randomUUID().toString());
        user.setName("test");
        userRepository.save(user);
    }

    @Test
    void encodePassword() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("123456"));
    }

}
