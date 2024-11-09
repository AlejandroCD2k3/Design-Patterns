package StructuralPatterns.Flyweight;

public class NPC {
    
    private int xCoordinate;
    private int yCoordinate;
    private NPCType npcType;
    
    public NPC(int xCoordinate, int yCoordinate, NPCType npcType){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.npcType = npcType;
    }
    
    public void spawn(){
        npcType.spawn(xCoordinate, yCoordinate);
    }
    
}
