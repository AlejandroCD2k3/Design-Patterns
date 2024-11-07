package Main;

import StructuralPatterns.Decorator.*;


public class Main {
    
    public static void main(String[] args){
        
        Beverage coffeeWithSugarAndMilkOrder = new SimpleCoffee();
        
        coffeeWithSugarAndMilkOrder = new Sugar(coffeeWithSugarAndMilkOrder);
        coffeeWithSugarAndMilkOrder = new Milk(coffeeWithSugarAndMilkOrder);
        
        Beverage coffeeWithChocolateOrder = new SimpleCoffee();
        
        coffeeWithChocolateOrder = new Chocolate(coffeeWithChocolateOrder);
        
        System.out.println(coffeeWithSugarAndMilkOrder.trink());
        System.out.println(coffeeWithChocolateOrder.trink());
        
    }
 
}