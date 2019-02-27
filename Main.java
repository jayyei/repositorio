package com.company;

import com.company.facade.facade;

public class Main {

    public static void main(String[] args) {
        facade Client = new facade();
        Client.search("Mexico","Cancun","Soon");
    }
}
