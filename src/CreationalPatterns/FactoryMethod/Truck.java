package CreationalPatterns.FactoryMethod;


public class Truck implements Transport{
    
    @Override
    public void deliver(){
        System.out.println("Delivering by land");
    }
    
}
