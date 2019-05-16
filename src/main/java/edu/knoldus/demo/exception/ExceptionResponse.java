package edu.knoldus.demo.exception;

public class ExceptionResponse {

    private String internalMessage;

    private String developerMessage;

    private int statusCode;

    public ExceptionResponse(String internalMessage, String developerMessage, int statusCode) {
        this.internalMessage = internalMessage;
        this.developerMessage = developerMessage;
        this.statusCode = statusCode;
    }


    public String getInternalMessage() {
        return internalMessage;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
