package Main;

import CreationalPatterns.Builder.*;

public class Main {
    
    public static void main(String[] args){
        
        Chef chef = new Chef();
        
        PizzaBuilder smallPizzaBuilder = new SmallPizzaBuilder();
        
        // --------- CREATING A PIZZA ---------
        
        chef.createSmallPepperoniPizza(smallPizzaBuilder);
        Pizza mySmallPizza = smallPizzaBuilder.build();
        
        System.out.println("Small Pizza created with: \n" + mySmallPizza.getCrust() + " crust\n" + mySmallPizza.getSauce() + " sauce\n" + mySmallPizza.getCheese() + " cheese \n" + mySmallPizza.getTopping() + " topping.");
        
    }
    
    
}
