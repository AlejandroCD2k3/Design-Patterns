package CreationalPatterns.Singleton;

// REMEMBER: Singleton should only be applied to atomic classes to avoid design issues. Avoid using it on tightly coupled classes.

public class MathOperations {
    
    public static MathOperations mathOperations;
    
    private MathOperations(){
    }
    
    public static synchronized MathOperations getMathOperations(){
        
        if(mathOperations == null){
            mathOperations = new MathOperations();
        }
        
        return mathOperations;
     
    }
    
    public int addNumbers(int firstValue, int secondValue){
        return firstValue + secondValue;
    }
    
    public int substractValues(int firstValue, int secondValue){
        return firstValue - secondValue;
    }
    
}
