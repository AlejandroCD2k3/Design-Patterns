package StructuralPatterns.Flyweight;

public class NPCType {
    
    private String name;
    private String skin;
    private String voice;
    private String behaviour;
    
    public NPCType(String name, String skin, String voice, String behaviour){
        this.name = name;
        this.skin = skin;
        this.voice = voice;
        this.behaviour = behaviour;
    }
    
    public void spawn(int xCoordinate, int yCoordinate){
        System.out.println(String.format("%s npc has spawned at\n X: %d\n Y: %d", name, xCoordinate, yCoordinate));
    }
    
}
