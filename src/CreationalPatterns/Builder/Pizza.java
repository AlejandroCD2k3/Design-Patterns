package CreationalPatterns.Builder;

public abstract class Pizza{
    
    protected final String crust;
    protected final String sauce;
    protected final String cheese;
    protected final String topping;
    
    public Pizza(String crust, String sauce, String cheese, String topping){
        this.crust = crust;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
    
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
