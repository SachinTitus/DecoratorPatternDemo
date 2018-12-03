package Decorator.main;

import Decorator.Beverage;

public class Tea extends Beverage {
    @Override
    public double cost() {
        return 1;
    }
}
