package CreationalPatterns.AbstractFactory;

public interface VehicleFactory {
    
    public Car createCar(int numberOfSeats, int numberOfDoors, int horsepower);
    
    public Motorcycle createMotorcycle(int displacement, String color, String transmissionMode);
    
}
