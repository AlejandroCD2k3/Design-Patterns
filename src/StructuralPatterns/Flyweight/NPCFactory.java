package StructuralPatterns.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class NPCFactory {
    
    private Map<String, NPCType> npcTypes = new HashMap<>();
    
    public NPCType getNPCType(String name, String skin, String voice, String behaviour) {
        
        NPCType existingNPCType = npcTypes.get(name);
        
        if (existingNPCType == null) {
            existingNPCType = new NPCType(name, skin, voice, behaviour);
            npcTypes.put(name, existingNPCType);
        }
        
        return existingNPCType;
    }
    
}
