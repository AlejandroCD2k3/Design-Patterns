package BehavioralPatterns.Visitor;

public interface Shape {
    public void acceptVisitor(ShapeVisitor shapeVisitor);
}
