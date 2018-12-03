package Decorator.main;

import Decorator.Beverage;

public class Coffee extends Beverage {

    public Coffee(){
        description = "Coffee";
    }
    @Override
    public double cost() {
        return 1;
    }
}
