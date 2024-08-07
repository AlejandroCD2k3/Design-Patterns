package CreationalPatterns.FactoryMethod;

public class Plane implements Transport{
    
    @Override
    public void deliver(){
        System.out.println("Delivering by air");
    }
    
}
