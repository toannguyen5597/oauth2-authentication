package com.cmc.demologin.data.service;

import com.cmc.demologin.data.entity.UserRoles;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserRoleService {
  List<UserRoles> getAll();

  List<UserRoles> getAllByUserID(Integer userID);

  List<UserRoles> getAllByRoleID(Integer roleID);

  UserRoles save(UserRoles userRoles);
}
