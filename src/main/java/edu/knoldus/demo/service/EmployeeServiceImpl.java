package edu.knoldus.demo.service;

import edu.knoldus.demo.exception.EmployeeNotfoundException;
import edu.knoldus.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    private List<Employee> employeeList = new ArrayList<>();
    @Override
    public List<Employee> getEmployee(String id) {

        if (isEmpFind(id)) {
            return employeeList.stream()
                    .filter(employee -> employee.getId().equalsIgnoreCase(id))
                    .collect(Collectors.toList());
        }

        throw new EmployeeNotfoundException("Id " + id + " does not exist");
    }

    private boolean isEmpFind(String id) {
        return employeeList.stream().anyMatch(employee -> employee.getId().equalsIgnoreCase(id));
    }

    @Override
    public List<Employee> insertEmployee(Employee emp) {

        Employee employee = Employee.builder()
                .id(emp.getId())
                .empName(emp.getEmpName())
                .build();
        employeeList.add(employee);

        return employeeList;
    }


    @Override
    public List<Employee> deleteEmployee(String id) {
        if (isEmpFind(id)) {
            employeeList
                    .remove(employeeList.stream()
                            .filter(emp -> emp.getId().equalsIgnoreCase(id))
                            .collect(Collectors.toList()).get(0));
            return employeeList;
        }

        throw new EmployeeNotfoundException("Id " + id + " does not exist");
    }
}
