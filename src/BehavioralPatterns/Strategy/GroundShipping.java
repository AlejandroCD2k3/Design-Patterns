package BehavioralPatterns.Strategy;

public class GroundShipping implements ShippingStrategy{

    @Override
    public double calculateCost(double weight) {
        return 5.0 + (weight*1.2);
    }
    
}
