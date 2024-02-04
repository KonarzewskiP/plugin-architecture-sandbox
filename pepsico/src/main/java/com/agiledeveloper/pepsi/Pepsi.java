package com.agiledeveloper.pepsi;

import com.agiledeveloper.softdrink.SoftDrink;

public class Pepsi implements SoftDrink {
    
    @Override
    public String getName() {
        return "Pepsi";
    }
    
    @Override
    public int getSize() {
        return 12;
    }
}
