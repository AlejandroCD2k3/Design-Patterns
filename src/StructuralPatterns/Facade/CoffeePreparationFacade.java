
package StructuralPatterns.Facade;

public class CoffeePreparationFacade implements Facade{

    private Beverage coffee;
    
    public CoffeePreparationFacade() {
        this.coffee = new SimpleCoffee();
    }

    
    @Override
    public Beverage prepareBeverage(String coffeeType) {
        
        switch(coffeeType.toLowerCase()){
            
            case "simple":
                break;
            case "latte":
                prepareLatte();
                break;
            case "mocha":
                prepareMocha();
                break;
            default:
                throw new IllegalArgumentException("Coffee not supported");
        }
        
        return coffee;
    }
    
    public void prepareLatte(){
        
        coffee = new Milk(coffee);
        coffee = new MilkFroth(coffee);
        
    }
    
    public void prepareMocha(){
        
        coffee = new Milk(coffee);
        coffee = new MilkFroth(coffee);
        coffee = new Chocolate(coffee);
        
    }
    
}
