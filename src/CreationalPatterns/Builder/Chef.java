package CreationalPatterns.Builder;

public class Chef {
    
    public void createSmallPepperoniPizza(PizzaBuilder builder){
        builder.setCrust("Thin");
        builder.setSauce("Tomato");
        builder.setCheese("Mozzarella");
        builder.setTopping("Pepperoni");
    }
    
}
