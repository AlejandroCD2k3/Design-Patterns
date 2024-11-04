package CreationalPatterns.AbstractFactory;

public abstract class Motorcycle {
    
    private final int displacement;
    private final String color;
    private final String transmissionMode;
    
    public Motorcycle(int displacement, String color, String transmissionMode){
        this.displacement = displacement;
        this.color = color;
        this.transmissionMode = transmissionMode;
    }
    
    public int getDisplacement(){
        return displacement;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public String getTransmissionMode(){
        return transmissionMode;
    }
}
