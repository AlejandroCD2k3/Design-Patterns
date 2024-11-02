package CreationalPatterns.Builder;

public class SmallPizzaBuilder implements PizzaBuilder{
    
    private String crust;
    private String sauce;
    private String cheese;
    private String topping;

    @Override
    public void setCrust(String typeOfCrust) {
        crust = typeOfCrust;
    }

    @Override
    public void setSauce(String typeOfSauce) {
        sauce = typeOfSauce;
    }

    @Override
    public void setCheese(String typeOfCheese) {
        cheese = typeOfCheese;
    }

    @Override
    public void setTopping(String typeOfTopping) {
        topping = typeOfTopping;
    }

    @Override
    public SmallPizza build() {
        return new SmallPizza(crust, sauce, cheese, topping);
    }
    
    // ------------------------------ 
    //      GETTERS AND SETTERS 
    // ------------------------------
    
    public String getCrust(){
        return crust;
    }
    
    public String getSauce(){
        return sauce;
    }
    
    public String getCheese(){
        return cheese;
    }
    
    public String getTopping(){
        return topping;
    }
}
