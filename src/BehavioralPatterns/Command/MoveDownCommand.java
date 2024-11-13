package BehavioralPatterns.Command;

public class MoveDownCommand implements Command{

    private Player player;
    
    public MoveDownCommand(Player player){
        this.player = player;
    }
    
    @Override
    public void execute() {
        player.moveDown();
    }
    
}
