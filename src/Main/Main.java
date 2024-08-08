package Main;

import CreationalPatterns.Prototype.*;

public class Main {
    
    public static void main(String[] args){
        
        PrototypeRegistry prototypeRegistry = new PrototypeRegistry();
        
        MinecraftSlime mySlimePrototype = new MinecraftSlime("Medium","Normal",10);
        System.out.println("Prototype Stats: " + mySlimePrototype.getSize() + ", " + mySlimePrototype.getKindOfSlime() + ", " + mySlimePrototype.getHealthPoints());
        prototypeRegistry.addPrototype("mediumMinecraftNormalSlime", mySlimePrototype);
        
        
        MinecraftSlime myClonedSlime = (MinecraftSlime) mySlimePrototype.clone();
        System.out.println("Clone Stats: " + myClonedSlime.getSize() + ", " + myClonedSlime.getKindOfSlime() + ", " + myClonedSlime.getHealthPoints());
    
        MinecraftSlime anotherClonedSlime = (MinecraftSlime) prototypeRegistry.getById("mediumMinecraftNormalSlime");
        System.out.println("Second Clone Stats: " + anotherClonedSlime.getSize() + ", " + anotherClonedSlime.getKindOfSlime() + ", " + anotherClonedSlime.getHealthPoints());
        
    }
    
    // The casting should be replaced with a factory method to add another layer of abstraction.
    
}
