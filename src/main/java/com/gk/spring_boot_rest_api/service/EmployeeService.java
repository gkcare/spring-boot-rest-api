package com.gk.spring_boot_rest_api.service;

import com.gk.spring_boot_rest_api.entity.Employee;
import com.gk.spring_boot_rest_api.repository.EmployeeRepository;
import jakarta.persistence.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee findById(int id){
        return employeeRepository.findById(id).orElseThrow(()-> new NoResultException("No data found for this id ->"+id));
    }

    public void deleteById(int id){
        if(!employeeRepository.existsById(id)){
            throw new RuntimeException("No data found for this id ->"+id);
        }

        employeeRepository.deleteById(id);
    }

}
