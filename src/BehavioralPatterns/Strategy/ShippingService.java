package BehavioralPatterns.Strategy;

public class ShippingService {
    
    private ShippingStrategy shippingStrategy;
    
    public ShippingService(ShippingStrategy shippingStrategy){
        this.shippingStrategy = shippingStrategy;
    }
    
    public void setStrategy(ShippingStrategy shippingStrategy){
        this.shippingStrategy = shippingStrategy;
    }
    
    public double calculateCost(double weight){
        return shippingStrategy.calculateCost(weight);
    }
    
}
