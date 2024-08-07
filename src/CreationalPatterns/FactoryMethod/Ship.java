package CreationalPatterns.FactoryMethod;

public class Ship implements Transport{
    
    @Override
    public void deliver(){
        System.out.println("Delivering by water");
    }
}
