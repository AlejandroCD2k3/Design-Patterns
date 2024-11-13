package BehavioralPatterns.Command;

public class GameController {
    
    private Command moveUpCommand;
    private Command moveDownCommand;
    private Command attackCommand;
    
    //--------------- COMMAND SETTERS ---------------
    
    public void setMoveUpCommand(Command moveUpCommand){
        this.moveUpCommand = moveUpCommand;
    }
    
    public void setMoveDownCommand(Command moveDownCommand){
        this.moveDownCommand = moveDownCommand;
    }
    
    public void setAttackCommand(Command attackCommand){
        this.attackCommand = attackCommand;
    }
    
    //--------------- COMMAND EXECUTERS ---------------
    
    public void pressUp(){
        moveUpCommand.execute();
    }
    
    public void pressDown(){
        moveDownCommand.execute();
    }
    
    public void pressClick(){
        attackCommand.execute();
    }
    
}
