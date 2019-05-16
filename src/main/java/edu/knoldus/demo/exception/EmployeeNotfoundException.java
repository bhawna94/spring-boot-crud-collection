package edu.knoldus.demo.exception;

public class EmployeeNotfoundException extends RuntimeException {

    public EmployeeNotfoundException(String message) {
        super(message);
    }
}
