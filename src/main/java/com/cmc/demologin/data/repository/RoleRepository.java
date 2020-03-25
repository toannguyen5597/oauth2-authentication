package com.cmc.demologin.data.repository;

import com.cmc.demologin.data.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Roles, Integer> {}
