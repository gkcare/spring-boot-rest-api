package com.gk.spring_boot_rest_api.controller;

import com.gk.spring_boot_rest_api.entity.Employee;
import com.gk.spring_boot_rest_api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public ResponseEntity<Employee> findById(@PathVariable("id") int id){
        return ResponseEntity.ok(employeeService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Employee>> findAll(){
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }

    @PostMapping
    public ResponseEntity<Employee> save(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.saveEmployee(employee));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") int id){
        employeeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
