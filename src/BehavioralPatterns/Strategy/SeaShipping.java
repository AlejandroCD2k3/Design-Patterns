package BehavioralPatterns.Strategy;

public class SeaShipping implements ShippingStrategy{
    
    @Override
    public double calculateCost(double weight){
        return 3.0 + (weight*1.1);
    }
    
}
