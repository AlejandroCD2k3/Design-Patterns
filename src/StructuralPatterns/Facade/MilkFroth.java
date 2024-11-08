package StructuralPatterns.Facade;

public class MilkFroth extends BeverageDecorator{
    
    public MilkFroth(Beverage beverage){
        super(beverage);
    }
    
    @Override
    public String trink() {
        return beverage.trink()+"\n MilkFroth";
    }

    @Override
    public float getPrice() {
        return beverage.getPrice() + 5;
    }
    
}
