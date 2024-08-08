package CreationalPatterns.Prototype;

import java.util.HashMap;

public class PrototypeRegistry {
    
    private HashMap<String, Prototype> prototypes = new HashMap<>();
    
    public void addPrototype(String idPrototype, Prototype prototype){
        prototypes.put(idPrototype, prototype);
    }
    
    public Prototype getById(String idPrototype){
        return prototypes.get(idPrototype);
    }
    
}