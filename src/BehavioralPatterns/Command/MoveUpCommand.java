package BehavioralPatterns.Command;

public class MoveUpCommand implements Command{
    
    private Player player;
    
    public MoveUpCommand(Player player){
        this.player = player;
    }
    
    @Override
    public void execute(){
        player.moveUp();
    }
    
}
