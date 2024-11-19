package BehavioralPatterns.Visitor;

public interface ShapeVisitor {
    
    public void visit(Circle circle);
    public void visit(Rectangle rectangle);
    
}
