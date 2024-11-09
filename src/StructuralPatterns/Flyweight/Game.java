package StructuralPatterns.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Game {
    
    public List<NPC> npcs = new ArrayList<>();
    private NPCFactory npcFactory = new NPCFactory();
    
    public void spawnNPC(int xCoordinate, int yCoordinate, String name, String skin, String voice, String behaviour){
        
        NPCType npcType = npcFactory.getNPCType(name, skin, voice, behaviour);
        
        NPC npc = new NPC(xCoordinate, yCoordinate, npcType);
        
        npc.spawn();
        
        npcs.add(npc);
        
        
    }
    
}
