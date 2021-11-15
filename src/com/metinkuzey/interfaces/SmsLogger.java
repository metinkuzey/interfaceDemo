package com.metinkuzey.interfaces;

public class SmsLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("SMS is sent. " + message);
    }
}
