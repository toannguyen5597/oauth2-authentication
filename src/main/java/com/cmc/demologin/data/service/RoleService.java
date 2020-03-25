package com.cmc.demologin.data.service;

import com.cmc.demologin.data.entity.Roles;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {
  List<Roles> getAll();

  Roles getByID(Integer id);

  Roles save(Roles roles);
}
