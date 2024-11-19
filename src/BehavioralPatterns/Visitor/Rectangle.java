package BehavioralPatterns.Visitor;

public class Rectangle implements Shape{

    private double width;
    private double height;
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void acceptVisitor(ShapeVisitor shapeVisitor) {
        shapeVisitor.visit(this);
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getHeight(){
        return height;
    }
    
}
