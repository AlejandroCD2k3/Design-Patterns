package Main;

import BehavioralPatterns.Memento.*;


public class Main {
    
    public static void main(String[] args){
        
        Game residentEvil4 = new Game();
        WritingMachine myWrittingMachine = new WritingMachine();
        
        //------------------
        
        residentEvil4.setState("Village", "Lake", 100);
        residentEvil4.showState();
        
        myWrittingMachine.saveGame(residentEvil4.save());
        
        //------------------
        
        residentEvil4.setState("Castle", "Yard", 130);
        residentEvil4.showState();
        
        myWrittingMachine.saveGame(residentEvil4.save());
        
        //------------------

        
        myWrittingMachine.loadGame(0);
        
        residentEvil4.showState();
        
    }
 
}