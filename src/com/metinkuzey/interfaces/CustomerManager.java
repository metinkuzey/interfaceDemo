package com.metinkuzey.interfaces;

public class CustomerManager {
    private Logger logger;
    private Logger[] loggers;

    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }
/*
    public CustomerManager(Logger logger) {
        this.logger = logger;
    }
*/
    public void addCustomer(Customer customer){
        System.out.println("Id: " + customer.getId() +
                          " Name: " + customer.getFirstName() +
                " " +  customer.getLastName() +
                            " added" );
        Utils.runLoggers(loggers,"Id: " + customer.getId() +
                " Name: " + customer.getFirstName() +
                " " +  customer.getLastName() +
                " added" );

    }
    public void deleteCustomer(Customer customer){
        System.out.println("Id: " + customer.getId() +
                " Name: " + customer.getFirstName() + " " +  customer.getLastName() +
                " deleted" );
        Utils.runLoggers(loggers,"Id: " + customer.getId() +
                " Name: " + customer.getFirstName() +
                " " +  customer.getLastName() +
                " deleted" );
    }
}
