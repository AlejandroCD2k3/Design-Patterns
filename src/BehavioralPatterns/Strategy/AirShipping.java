package BehavioralPatterns.Strategy;

public class AirShipping implements ShippingStrategy{
    
    @Override
    public double calculateCost(double weight){
        return 10.0 + (weight*2.5);
    }
    
}
