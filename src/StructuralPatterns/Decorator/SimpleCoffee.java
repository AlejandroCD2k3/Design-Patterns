package StructuralPatterns.Decorator;

public class SimpleCoffee implements Beverage{

    @Override
    public String trink(){
        return "Trinking a coffee with:";
    }

    @Override
    public float getPrice() {
        return 10;
    }
      
}
