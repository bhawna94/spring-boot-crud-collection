package edu.knoldus.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.io.IOException;

@ControllerAdvice
@RestController
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EmployeeNotfoundException.class)
    public ResponseEntity<ExceptionResponse> springHandleNotFound(EmployeeNotfoundException exception) throws IOException {

        ExceptionResponse exceptionres = new ExceptionResponse(exception.getMessage(), exception.getMessage(), HttpStatus.NOT_FOUND.value());

        return new ResponseEntity<>(exceptionres, HttpStatus.NOT_FOUND);

    }
}
