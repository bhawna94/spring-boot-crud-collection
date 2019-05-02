package edu.knoldus.demo.model;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Employee {

    String id;

    String empName;
}
