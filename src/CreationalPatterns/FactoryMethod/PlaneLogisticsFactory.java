package CreationalPatterns.FactoryMethod;

public class PlaneLogisticsFactory extends LogisticsFactory{
    
    @Override
    public Transport createTransport(){
        return new Plane();
    }
}
