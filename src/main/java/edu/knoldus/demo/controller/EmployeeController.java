package edu.knoldus.demo.controller;

import edu.knoldus.demo.model.Employee;
import edu.knoldus.demo.service.EmployeeService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    EmployeeService employeeService;

    public EmployeeController(EmployeeService service) {
        this.employeeService = service;
    }

    @GetMapping("/employee/{id}")
    List<Employee> getEmployee(@PathVariable String id) {
        return employeeService.getEmployee(id);
    }

    @PostMapping("/employee/add")
    List<Employee> insertEmployee(@RequestBody Employee employee) {
        return employeeService.insertEmployee(employee);
    }

    @DeleteMapping("/employee/delete/{id}")
    List<Employee> deleteEmployee(@PathVariable String id) {
        return employeeService.deleteEmployee(id);
    }

}
