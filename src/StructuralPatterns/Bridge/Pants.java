package StructuralPatterns.Bridge;

public class Pants extends Garment{
    
    public Pants(Size size){
        super(size);
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Pants - " + size.getDescription());
    }
}
