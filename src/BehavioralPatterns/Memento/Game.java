package BehavioralPatterns.Memento;

public class Game implements Originator{
    
    private String level;
    private String position;
    private int health;
    
    public void setState(String level, String position, int health){
        this.level = level;
        this.position = position;
        this.health = health;
    }
    
    @Override
    public Memento save(){
        return new GameSave(this, level, position, health);
    }
    
    public void showState(){
        System.out.println(String.format("\nLevel %s\n Position: %s\n health %d",level, position, health));
    }
    
}
