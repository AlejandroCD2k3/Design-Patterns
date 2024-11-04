package CreationalPatterns.AbstractFactory;

public class DeliveryVehicleFactory implements VehicleFactory{

    @Override
    public Car createCar(int numberOfSeats, int numberOfDoors, int horsepower) {
        return new DeliveryCar(numberOfSeats, numberOfDoors, horsepower);
    }

    @Override
    public Motorcycle createMotorcycle(int displacement, String color, String transmissionMode) {
        return new DeliveryMotorcycle(displacement, color, transmissionMode);
    }
    
}
