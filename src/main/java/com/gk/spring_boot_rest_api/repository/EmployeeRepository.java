package com.gk.spring_boot_rest_api.repository;

import com.gk.spring_boot_rest_api.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
