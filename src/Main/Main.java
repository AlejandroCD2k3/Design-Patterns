package Main;

import BehavioralPatterns.State.*;


public class Main {
    
    public static void main(String[] args){
        
        CandyMachine candyMachine = new CandyMachine(3);

        candyMachine.insertCoin();
        candyMachine.turnCrank();
        candyMachine.dispenseCandy();
        
        System.out.println("-----------------");

        candyMachine.insertCoin();
        candyMachine.ejectCoin();
        candyMachine.dispenseCandy();

        System.out.println("-----------------");
        
        candyMachine.insertCoin();
        candyMachine.turnCrank();
        candyMachine.dispenseCandy();
        
        System.out.println("-----------------");
        
        candyMachine.insertCoin();
        candyMachine.turnCrank();
        candyMachine.dispenseCandy();
        
        System.out.println("-----------------");

        candyMachine.insertCoin(); // No candies left
        
    }
 
}