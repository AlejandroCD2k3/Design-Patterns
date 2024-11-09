package Main;

import StructuralPatterns.Flyweight.*;


public class Main {
    
    public static void main(String[] args){
        
        Game myGame = new Game();
        myGame.spawnNPC(20, 50, "Allison", "studentGirl", "sweet", "proactive");
        
    }
 
}