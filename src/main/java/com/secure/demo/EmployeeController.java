package com.secure.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @GetMapping(produces = "application/json")
  public List<Employee> getEmployees() {
    return employeeService.getAllEmployees();
  }
}