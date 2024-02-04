package com.agiledeveloper.coke;

import com.agiledeveloper.softdrink.SoftDrink;

public class Coke implements SoftDrink {
    @Override
    public String getName() {
        return "Coke";
    }
    
    @Override
    public int getSize() {
        return 12;
    }
}
