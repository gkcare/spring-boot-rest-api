package com.gk.spring_boot_rest_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;
    private String name;
    private String email;
    private String mobile;
    private String country;

}
