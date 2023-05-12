package com.secure.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

  public List<Employee> getAllEmployees() {
    List<Employee> empList = new ArrayList<>();
    empList.add(Employee.builder().name("John").surname("Doe").build());
    empList.add(Employee.builder().name("Jane").surname("Doe").build());
    return empList;
  }

}
