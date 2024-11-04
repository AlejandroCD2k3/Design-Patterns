package CreationalPatterns.AbstractFactory;

public class SportsVehicleFactory implements VehicleFactory{

    @Override
    public Car createCar(int numberOfSeats, int numberOfDoors, int horsepower) {
        return new SportsCar(numberOfSeats, numberOfDoors, horsepower);
    }

    @Override
    public Motorcycle createMotorcycle(int displacement, String color, String transmissionMode) {
        return new SportsMotorcycle(displacement, color, transmissionMode);
    }
    
}
