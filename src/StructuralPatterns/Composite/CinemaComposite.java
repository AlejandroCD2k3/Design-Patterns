package StructuralPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class CinemaComposite implements IComponent{
    
    private String identifier; 
    private List<IComponent> components = new ArrayList<>();

    public CinemaComposite(String identifier){
        this.identifier = identifier;
    }
    
    @Override
    public String showIdentifier() {
        return identifier;
    }
    
    public void addComponent(IComponent component){
        components.add(component);
    }
    
    public void removeComponent(IComponent component){
        components.remove(component);
    }
    
    public List<IComponent> getComponents(){
        return new ArrayList<>(components);
    }
    
}
