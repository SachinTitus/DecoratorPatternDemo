package Decorator.main;

import refactored.Beverages;

public class Espresso extends Beverages {
    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double getCost() {
        return 1.99;
    }
}
