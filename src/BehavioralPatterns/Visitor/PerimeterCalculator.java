package BehavioralPatterns.Visitor;

public class PerimeterCalculator implements ShapeVisitor{

    @Override
    public void visit(Circle circle) {
        double perimeter = 2 * Math.PI * circle.getRadius();
        System.out.println(String.format("Circle perimeter: %f",perimeter));
    }

    @Override
    public void visit(Rectangle rectangle) {
        double perimeter = 2 * (rectangle.getHeight() + rectangle.getWidth());
        System.out.println(String.format("Rectangle perimeter: %f",perimeter));
    }
    
    
    
}
