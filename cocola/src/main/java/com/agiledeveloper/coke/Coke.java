package com.agiledeveloper.coke;

import com.agiledeveloper.softdrink.SoftDrink;

public class Coke implements SoftDrink {
    public Coke() {
        System.out.println("created..." + this);
        
    }
    
    @Override
    public String getName() {
        return "Coke";
    }
    
    @Override
    public int getSize() {
        return 12;
    }
}
