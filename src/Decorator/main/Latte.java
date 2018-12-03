package Decorator.main;

import Decorator.Beverage;

public class Latte extends Beverage {
    public Latte(){
        description = "Latte";
    }
    @Override
    public double cost() {
        return 2.10;
    }
}
