package Main;

import BehavioralPatterns.ChainOfResponsability.*;


public class Main {
    
    public static void main(String[] args){
        
        SupportHandler basicSupport = new AnsweringMachine();
        SupportHandler intermediateSupport = new SupportAgent();
        SupportHandler advancedSupport = new SpecializedEngenieer();
        
        basicSupport.setNextHandler(intermediateSupport);
        intermediateSupport.setNextHandler(advancedSupport);
        
        basicSupport.handleRequest("basic");
        System.out.println("--------------------------");
        basicSupport.handleRequest("intermediate");
        System.out.println("--------------------------");
        basicSupport.handleRequest("advanced");
        System.out.println("--------------------------");
        basicSupport.handleRequest("expert");
        
    }
 
}