package StructuralPatterns.Composite;

public class Multiplex extends CinemaComposite{
    
    private String multiplexName;
    
    public Multiplex(String multiplexIdentifier, String multiplexName){
        super(multiplexIdentifier);
        this.multiplexName = multiplexName;
    }
    
    public String getName(){
        return multiplexName;
    }
}
