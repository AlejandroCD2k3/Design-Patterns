package Main;

import CreationalPatterns.FactoryMethod.*;

public class Main {
    
    public static void main(String[] args){
        
        Transport mediumTruck = new TruckLogisticsFactory().createTransport();
        mediumTruck.deliver();
        
    }
    
}
