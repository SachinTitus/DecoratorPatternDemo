package Decorator.condiments;

import Decorator.Beverage;

public class Sugar extends CondimentDecorator {
    Beverage beverage;
    public Sugar(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+", sugar";
    }

    @Override
    public double cost() {
        return beverage.cost();
    }
}
