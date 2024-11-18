package BehavioralPatterns.Memento;

public class GameSave implements Memento{

    private final Game game;
    private final String level;
    private final String position;
    private final int health;
    
    public GameSave(Game game, String level, String position, int health){
        this.game = game;
        this.level = level;
        this.position = position;
        this.health = health;
    }
    
    @Override
    public void restore() {
        game.setState(level, position, health);
    }
    
}
