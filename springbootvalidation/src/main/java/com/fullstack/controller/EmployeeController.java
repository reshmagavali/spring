package com.fullstack.controller;

import com.fullstack.model.Employee;
import com.fullstack.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/save")
    public ResponseEntity<Employee> save( @Valid @RequestBody Employee employee)
    {
      return  ResponseEntity.ok(employeeService.save(employee));
    }
    @GetMapping("/findbyid/{empId}")
    public ResponseEntity<Optional<Employee>> findById(@PathVariable int empId)
    {
        return  ResponseEntity.ok(employeeService.findById(empId));
    }
}
