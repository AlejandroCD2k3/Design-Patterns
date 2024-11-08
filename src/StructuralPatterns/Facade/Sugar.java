package StructuralPatterns.Facade;

public class Sugar extends BeverageDecorator{
    
    public Sugar(Beverage beverage) {
        super(beverage);
    }
    
    @Override
    public String trink() {
        return beverage.trink()+"\n Sugar";
    }

    @Override
    public float getPrice() {
        return beverage.getPrice() + 2;
    }
    
}