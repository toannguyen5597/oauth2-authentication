package com.cmc.demologin.data.service.serviceImpl;

import com.cmc.demologin.data.entity.Roles;
import com.cmc.demologin.data.repository.RoleRepository;
import com.cmc.demologin.data.service.RoleService;

import java.util.List;

public class RoleServiceImpl implements RoleService {
  private final RoleRepository roleRepository;

  public RoleServiceImpl(RoleRepository roleRepository) {
    this.roleRepository = roleRepository;
  }

  @Override
  public List<Roles> getAll() {
    return roleRepository.findAll();
  }

  @Override
  public Roles getByID(Integer id) {
    return roleRepository.findById(id).get();
  }

  @Override
  public Roles save(Roles roles) {
    return roleRepository.save(roles);
  }
}
