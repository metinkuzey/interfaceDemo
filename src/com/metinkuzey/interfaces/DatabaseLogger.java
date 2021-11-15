package com.metinkuzey.interfaces;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Info is stored in database. " + message);
    }
}
