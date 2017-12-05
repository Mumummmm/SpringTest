package com.pansy.service;

import java.util.Map;

public class Command {
    private Map commandState;

    public void setCommandState(Map commandState) {
        this.commandState = commandState;
    }

    public Object execute() {
        return new Object();
    }
}
