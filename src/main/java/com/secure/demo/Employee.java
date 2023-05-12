package com.secure.demo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {

  private String name;
  private String surname;

}
