package StructuralPatterns.Facade;

public class Milk extends BeverageDecorator{
    
    public Milk(Beverage beverage){
        super(beverage);
    }
    
    @Override
    public String trink() {
        return beverage.trink()+"\n Milk";
    }

    @Override
    public float getPrice() {
        return beverage.getPrice() + 5;
    }
    
}

