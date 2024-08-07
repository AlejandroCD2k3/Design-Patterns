package CreationalPatterns.FactoryMethod;

public class TruckLogisticsFactory extends LogisticsFactory {
    
    @Override
    public Transport createTransport(){
        return new Truck();
    }
    
}
