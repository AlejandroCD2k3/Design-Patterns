package Main;

import CreationalPatterns.AbstractFactory.*;

public class Main {
    
    public static void main(String[] args){
        
        VehicleFactory sportsVehicleFactory = new SportsVehicleFactory();
        
        Car sportsCar = sportsVehicleFactory.createCar(2, 2, 400);
        System.out.println("Sports car type: " + sportsCar.getClass().getName());
    }
    
}
