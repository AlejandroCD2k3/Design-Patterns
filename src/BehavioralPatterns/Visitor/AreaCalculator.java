package BehavioralPatterns.Visitor;

public class AreaCalculator implements ShapeVisitor{

    @Override
    public void visit(Circle circle) {
        double area = Math.PI * Math.pow(circle.getRadius(), 2);
        System.out.println(String.format("Circle area: %f",area));
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getHeight() * rectangle.getWidth();
        System.out.println(String.format("Rectangle area: %f",area));
    }
    
}
