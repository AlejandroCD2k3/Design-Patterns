package Main;

import BehavioralPatterns.Command.*;


public class Main {
    
    public static void main(String[] args){
        
        Player mainCharacter = new Player();
        
        Command moveUpCommand = new MoveUpCommand(mainCharacter);
        Command moveDownCommand = new MoveDownCommand(mainCharacter);
        Command attackCommand = new AttackCommand(mainCharacter);
        
        GameController gameController = new GameController();
        
        gameController.setMoveUpCommand(moveUpCommand);
        gameController.setMoveDownCommand(moveDownCommand);
        gameController.setAttackCommand(attackCommand);
        
        gameController.pressUp();
        
    }
 
}