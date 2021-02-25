package com.example.oauth2.repository;

import com.example.oauth2.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {

    @Query(" select r from User u, Role r where u.roleId = r.roleId and u.userId = :userId ")
    List<Role> findAllByUser(@Param("userId") String userId);
}
