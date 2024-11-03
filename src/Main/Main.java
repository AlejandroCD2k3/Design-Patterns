package Main;

import CreationalPatterns.Singleton.*;

public class Main {
    
    public static void main(String[] args){
        
        MathOperations mathOps = MathOperations.getMathOperations();
        
        System.out.println(mathOps.addNumbers(5, 2));
        
    }
    
    
}
