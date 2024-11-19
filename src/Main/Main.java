package Main;

import BehavioralPatterns.Visitor.*;


public class Main {
    
    public static void main(String[] args){
        
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4,6);
        
        ShapeVisitor areaCalculator = new AreaCalculator();
        ShapeVisitor perimeterCalculator = new PerimeterCalculator();
        
        System.out.println("Calculating areas:");
        circle.acceptVisitor(areaCalculator);
        rectangle.acceptVisitor(areaCalculator);
        
        System.out.println("-----------------------\nCalculating perimeters:");
        circle.acceptVisitor(perimeterCalculator);
        rectangle.acceptVisitor(perimeterCalculator);
        
    }
 
}