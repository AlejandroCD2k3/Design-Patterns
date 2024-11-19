package BehavioralPatterns.Visitor;

public class Circle implements Shape{
    
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public void acceptVisitor(ShapeVisitor shapeVisitor){
        shapeVisitor.visit(this);
    }
    
    public double getRadius(){
        return radius;
    }
    
}
