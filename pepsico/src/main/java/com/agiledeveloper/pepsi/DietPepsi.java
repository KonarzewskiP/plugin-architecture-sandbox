package com.agiledeveloper.pepsi;

import com.agiledeveloper.softdrink.SoftDrink;

public class DietPepsi implements SoftDrink {
    private int size;
    
    public DietPepsi(int size) {
        this.size = size;
    }
    // you need this method with this specific name to create DietCode object.
    public static DietPepsi provider(){
        return new DietPepsi(10);
    }
    
    @Override
    public String getName() {
        return "Diet Pepsi";
    }
    
    @Override
    public int getSize() {
        return size;
    }
}
