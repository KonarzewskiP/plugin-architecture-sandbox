package com.agiledeveloper.coke;

import com.agiledeveloper.softdrink.SoftDrink;

public class DietCoke implements SoftDrink {
    @Override
    public String getName() {
        return "Diet Coke";
    }
    
    @Override
    public int getSize() {
        return 12;
    }
}
