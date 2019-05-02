package edu.knoldus.demo.service;

import edu.knoldus.demo.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployee(String id);

    List<Employee> insertEmployee(Employee emp);

    List<Employee> deleteEmployee(String id);
}
