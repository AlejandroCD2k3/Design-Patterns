package Main;

import BehavioralPatterns.Strategy.*;


public class Main {
    
    public static void main(String[] args){
        
        ShippingStrategy groundShipping = new GroundShipping();
        ShippingStrategy airShipping = new AirShipping();
        ShippingStrategy seaShipping = new SeaShipping();
        
        double weight = 12.5;
        
        ShippingService shippingService = new ShippingService(groundShipping);
        System.out.println(String.format("Ground shipping cost: $%f", shippingService.calculateCost(weight)));
        
        System.out.println("--------------------");
        
        shippingService.setStrategy(airShipping);
        System.out.println(String.format("Air shipping cost: $%f", shippingService.calculateCost(weight)));
        
        System.out.println("--------------------");
        
        shippingService.setStrategy(seaShipping);
        System.out.println(String.format("Sea shipping cost: $%f", shippingService.calculateCost(weight)));
    }
 
}