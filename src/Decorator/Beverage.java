package Decorator;

public abstract class Beverage {
    protected String description = "Unknown blend";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
