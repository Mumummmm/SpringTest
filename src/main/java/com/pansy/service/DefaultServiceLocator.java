package com.pansy.service;

public class DefaultServiceLocator {
    public ClientService2 createClientServiceInstance() {
        return new ClientService2();
    }

    public Account createAccountServiceInstance() {
        return new Account();
    }
}
