package com.cmc.demologin.data.service;

import com.cmc.demologin.data.entity.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
  List<Users> getAll();

  List<Users> getAllByLastName(String lastName);

  Users getByID(Integer id);

  Users getByEmail(String email);

  Users save(Users users);
}
