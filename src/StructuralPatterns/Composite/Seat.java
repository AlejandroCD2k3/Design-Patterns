package StructuralPatterns.Composite;

public class Seat implements IComponent{

    private String seatIdentifier;
    private int price;
    private boolean isVIP;
    private boolean isOccupied;
    
    public Seat(String seatIdentifier){
        this.seatIdentifier = seatIdentifier;
    }
    
    @Override
    public String showIdentifier() {
        return this.seatIdentifier;
    }
    
    public void setVIP(boolean isVIP){
        this.isVIP = isVIP;
        setPrice(isVIP);
    }
    
    private void setPrice(boolean isVIP){
        if(isVIP){
            price = 10;
        }
        else{
            price = 5;
        }
    }
    
    public void setOccupied(boolean isOccupied){
       this.isOccupied = isOccupied; 
    }
    
    public int getPrice(){
        return price;
    }
    
    public boolean isVIP(){
        return isVIP;
    }
    
    public boolean isOccuppied(){
        return isOccupied;
    }
    
}
