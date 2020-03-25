package com.cmc.demologin.data.repository;

import com.cmc.demologin.data.entity.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRoles, Integer> {
  List<UserRoles> findAllByUserIdAndIsDeleteIsFalse(Integer userID);

  List<UserRoles> findAllByRoleIdAndIsDeleteIsFalse(Integer roleID);
}
