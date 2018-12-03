package refactored;

public class Beverages {
    protected String description;
    protected double cost;
    boolean milk;
    boolean whip;
    boolean esspresso;

    public String getDescription() {
        return description;
    }
    public double getCost(){
        return cost;
    }
    public void hasMilk(){
        cost += 0.30F;
    }
    public void hasWhip(){
        cost += 0.10F;
    }
    public void hasEsspresso(){
        cost+= 1;
    }
}
