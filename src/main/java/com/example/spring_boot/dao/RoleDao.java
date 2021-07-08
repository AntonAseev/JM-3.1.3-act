package com.example.spring_boot.dao;

import com.example.spring_boot.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
