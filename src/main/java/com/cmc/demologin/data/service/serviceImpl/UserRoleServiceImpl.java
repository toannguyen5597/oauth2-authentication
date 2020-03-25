package com.cmc.demologin.data.service.serviceImpl;

import com.cmc.demologin.data.entity.UserRoles;
import com.cmc.demologin.data.repository.UserRoleRepository;
import com.cmc.demologin.data.service.UserRoleService;

import java.util.List;

public class UserRoleServiceImpl implements UserRoleService {
  private final UserRoleRepository userRoleRepository;

  public UserRoleServiceImpl(UserRoleRepository userRoleRepository) {
    this.userRoleRepository = userRoleRepository;
  }

  @Override
  public List<UserRoles> getAll() {
    return userRoleRepository.findAll();
  }

  @Override
  public List<UserRoles> getAllByUserID(Integer userID) {
    return userRoleRepository.findAllByUserIdAndIsDeleteIsFalse(userID);
  }

  @Override
  public List<UserRoles> getAllByRoleID(Integer roleID) {
    return userRoleRepository.findAllByRoleIdAndIsDeleteIsFalse(roleID);
  }

  @Override
  public UserRoles save(UserRoles userRoles) {
    return userRoleRepository.save(userRoles);
  }
}
