package CreationalPatterns.AbstractFactory;

public abstract class Car {
    
    private final int numberOfSeats;
    private final int numberOfDoors;
    private final int horsepower;
    
    public Car(int numberOfSeats, int numberOfDoors, int horsepower){
        this.numberOfSeats = numberOfSeats;
        this.numberOfDoors = numberOfDoors;
        this.horsepower = horsepower;
    }
    
    public int getNumberOfSeats(){
        return numberOfSeats;
    }
    
    public int getNumberOfDoors(){
        return numberOfDoors;
    }
    
    public int horsepower(){
        return horsepower;
    }
    
}
