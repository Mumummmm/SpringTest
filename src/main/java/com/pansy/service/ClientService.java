package com.pansy.service;

public class ClientService {

    private static class innerClientService {
        private static final ClientService INSTANCE = new ClientService();

    }

    public static ClientService createInstance(){
        return innerClientService.INSTANCE;
    }
}
