package com.agiledeveloper.client;

import com.agiledeveloper.softdrink.SoftDrink;

import java.util.ServiceLoader;

public class Client {
    
    public static void main(String[] args) {
        System.out.println("let's look for soft-drinks:");
        
        var softdrinks = ServiceLoader.load(SoftDrink.class);
        
        for (var softdrink : softdrinks) {
            System.out.println(softdrink.getName() + ": " + softdrink.getSize());
        }
    }
}
