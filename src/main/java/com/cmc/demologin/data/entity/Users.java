package com.cmc.demologin.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users extends BaseEntity {
  private String firtName;
  private String lastName;
  private String email;
  private String userName;
  private String passWord;
}
