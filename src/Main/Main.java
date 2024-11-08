package Main;

import StructuralPatterns.Facade.*;


public class Main {
    
    public static void main(String[] args){
        
        Facade myFacade = new CoffeePreparationFacade();
        
        System.out.println(myFacade.prepareBeverage("mocha").trink());
        
    }
 
}