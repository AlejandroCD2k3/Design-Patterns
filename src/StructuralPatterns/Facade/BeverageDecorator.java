package StructuralPatterns.Facade;

public abstract class BeverageDecorator implements Beverage{

    protected Beverage beverage;
    
    public BeverageDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    
    @Override
    public String trink() {
        return beverage.trink();
    }

    @Override
    public float getPrice() {
        return beverage.getPrice();
    }
    
}
