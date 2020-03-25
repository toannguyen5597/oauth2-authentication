package com.cmc.demologin.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private Long createdAt = System.currentTimeMillis();

  private Long updatedAt = System.currentTimeMillis();

  @Column(columnDefinition = "BOOLEAN DEFAULT false")
  private Boolean isDelete;
}
