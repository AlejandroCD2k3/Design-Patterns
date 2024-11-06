package StructuralPatterns.Composite;

public class Room extends CinemaComposite{
    
    private String roomName;
    
    public Room(String roomIdentifier, String roomName){
        super(roomIdentifier);
        this.roomName = roomName;
    }
    
    public String getName(){
        return roomName;
    }
    
}
