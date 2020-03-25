package com.cmc.demologin.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserRoles extends BaseEntity {
  private Integer userId;
  private Integer roleId;
  private String description;
}
