package com.agiledeveloper.client;

import com.agiledeveloper.softdrink.SoftDrink;

import java.util.ServiceLoader;

/**
 * In correct implementation of Plugin architecture with ServiceLoader,
 * classes are available exclusively at Runtime not Compile time.
 *
 * From design point of view as an architect/technical lead you can build design and don't
 * worry that programmers will use classes which they not suppose to. The compiler is watching
 * to not breach this rule
 *
 * */

public class Client {
    
    public static void main(String[] args) {
        System.out.println("let's look for soft-drinks:");
        // get all the implementations of SoftDrink interface
        ServiceLoader<SoftDrink> softdrinks = ServiceLoader.load(SoftDrink.class);

        /**
         * 1. in functional looping you are getting Provider instead of Implementation
         * let's look for soft-drinks:
         * java.util.ServiceLoader$ProviderImpl@2fe307a8
         * java.util.ServiceLoader$ProviderImpl@ddae1a78
         * */
        softdrinks.stream()
                .filter(provider -> provider.type().isAnnotationPresent("whatKindOfAnnotationYouExpect?"))
                .map(ServiceLoader.Provider::get)
                .map(softdrink -> softdrink.getName() + ": " + softdrink.getSize())
                .forEach(System.out::println);
        
        
  /*
        System.out.println("Got soft drinks ");
        // 1. Once objects are created they are cached by loader provider
        */ /**
         * 2. In regular iteration style loop, your objects are implemented lazy
         * let's look for soft-drinks:
         * Got soft drinks
         * com.agiledeveloper.pepsi.Pepsi@439f5b3d
         * com.agiledeveloper.pepsi.DietPepsi@5010be6
         * *//*
        for (var softdrink : softdrinks) {
            System.out.println(softdrink.getName() + ": " + softdrink.getSize());
        }
        
        System.out.println("--------- reiterate ---------");
        softdrinks.reload(); // <-- without this line ServiceLoader will load objects from cache
        // .reload() will destroy cache and load new objects.
        for (var softdrink : softdrinks) {
            System.out.println(softdrink.getName() + ": " + softdrink.getSize());
        }*/
    }
}
