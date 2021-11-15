package com.metinkuzey.interfaces;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Logged in text file. " + message);
    }
}
