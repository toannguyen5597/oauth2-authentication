package com.cmc.demologin.data.service.serviceImpl;

import com.cmc.demologin.data.entity.Users;
import com.cmc.demologin.data.repository.UserRepository;
import com.cmc.demologin.data.service.UserService;
import org.apache.catalina.User;

import java.util.List;

public class UserServiceImpl implements UserService {
  private final UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public List<Users> getAll() {
    return userRepository.findAll();
  }

  @Override
  public List<Users> getAllByLastName(String lastName) {
    return userRepository.findAllByLastNameAndIsDeleteIsFalse(lastName);
  }

  @Override
  public Users getByID(Integer id) {
    return userRepository.findById(id).get();
  }

  @Override
  public Users getByEmail(String email) {
    return userRepository.findAllByEmailAndIsDeleteIsFalse(email);
  }

  @Override
  public Users save(Users users) {
    return userRepository.save(users);
  }
}
