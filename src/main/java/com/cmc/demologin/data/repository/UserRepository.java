package com.cmc.demologin.data.repository;

import com.cmc.demologin.data.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Integer> {
  List<Users> findAllByLastNameAndIsDeleteIsFalse(String lastName);

  Users findAllByEmailAndIsDeleteIsFalse(String email);
}
