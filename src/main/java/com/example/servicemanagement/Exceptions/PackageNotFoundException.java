package com.example.servicemanagement.Exceptions;

public class PackageNotFoundException extends RuntimeException {
    public PackageNotFoundException(String message) {
        super(message);
    }
}
