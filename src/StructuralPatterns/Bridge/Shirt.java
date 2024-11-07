package StructuralPatterns.Bridge;

public class Shirt extends Garment{

    
    public Shirt(Size size){
        super(size);
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Shirt - " + size.getDescription());
    }
    
}
