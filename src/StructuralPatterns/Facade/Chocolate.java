package StructuralPatterns.Facade;

public class Chocolate extends BeverageDecorator{
    
    public Chocolate(Beverage beverage){
        super(beverage);
    }
    
    @Override
    public String trink() {
        return beverage.trink()+"\n Chocolate";
    }

    @Override
    public float getPrice() {
        return beverage.getPrice() + 6;
    }
    
}
