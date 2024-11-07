package StructuralPatterns.Bridge;

public abstract class Garment {
    
    protected Size size;
    
    public Garment(Size size){
        this.size = size;
    }
    
    public abstract void displayDetails();
    
}
