package CreationalPatterns.FactoryMethod;

public class ShipLogisticsFactory extends LogisticsFactory{
    
    @Override
    public Transport createTransport(){
        return new Ship();
    }
    
}
