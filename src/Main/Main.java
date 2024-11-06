package Main;

import StructuralPatterns.Composite.*;
import java.util.UUID;

public class Main {
    
    public static void main(String[] args){
        Multiplex multiplex = buildMultiplex(5);
        printMultiplexDetails(multiplex);
    }
    
    public static Multiplex buildMultiplex(int roomQuantity){
        Multiplex multiplex = new Multiplex(generateRandomID(), "multiplexSpecificName");
        for(int i = 0; i < roomQuantity; i++){
            buildRooms(multiplex, i);
        }
        return multiplex;
    }
    
    public static Multiplex buildRooms(Multiplex multiplex, int roomNumber){
        Room room = new Room(generateRandomID(), "Room " + roomNumber);
        multiplex.addComponent(room);
        buildSeats(room, 10);
        return multiplex;
    }
    
    public static void buildSeats(Room room, int seatsQuantity){
        for (int i = 0; i < seatsQuantity; i++) {
            Seat seat = new Seat(generateRandomID());
            room.addComponent(seat);
        }
    }

    public static String generateRandomID() {
        return UUID.randomUUID().toString();
    }
    
    public static void printMultiplexDetails(Multiplex multiplex) {
        System.out.println("Multiplex: " + multiplex.showIdentifier());
        for (IComponent component : multiplex.getComponents()) {
            if (component instanceof Room) {
                Room room = (Room) component;
                System.out.println("  Room: " + room.showIdentifier());
                for (IComponent seatComponent : room.getComponents()) {
                    if (seatComponent instanceof Seat) {
                        Seat seat = (Seat) seatComponent;
                        System.out.println("    Seat: " + seat.showIdentifier() + " (VIP: " + seat.isVIP() + ")");
                    }
                }
            }
        }
    }
}