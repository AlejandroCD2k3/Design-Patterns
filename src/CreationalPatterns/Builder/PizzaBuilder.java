package CreationalPatterns.Builder;

public interface PizzaBuilder {
    
    public void setCrust(String typeOfCrust);
    public void setSauce(String typeOfSauce);
    public void setCheese(String typeOfCheese);
    public void setTopping(String typeOfTopping);
    public Pizza build();
    
}
