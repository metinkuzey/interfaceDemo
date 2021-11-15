package com.metinkuzey.interfaces;

public class Main {
    public static void main(String[] args) {
        Logger [] loggers = {new SmsLogger(),new FileLogger()};
        CustomerManager customerManager = new CustomerManager(loggers);
        Customer customer = new Customer(1,"Metin","Kuzey" );
        Customer customer2 = new Customer(2,"Kuzey","Metin" );
        customerManager.addCustomer(customer);
        customerManager.deleteCustomer(customer2);
    }
}
