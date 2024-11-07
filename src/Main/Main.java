package Main;

import StructuralPatterns.Bridge.*;


public class Main {
    
    public static void main(String[] args){
        
        Size smallSize = new SmallSize();
        Size mediumSize = new MediumSize();
        
        Garment myPants = new Pants(smallSize);
        Garment myShirt = new Shirt(mediumSize);
        
        myPants.displayDetails();
        myShirt.displayDetails();
    }
 
}