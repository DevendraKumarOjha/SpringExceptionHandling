package com.dinfosoft.springexceptionhandling.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Entity
@Table(name="USER_TABLE")
public class User {
    @Id
    @GeneratedValue
    int userId;
    String name;
    String email;
    private String mobile;
    private String gender;
    private int age;
    private String nationality;
}
