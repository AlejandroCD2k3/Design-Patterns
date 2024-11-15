package BehavioralPatterns.Mediator;

public class ChatUser extends User{

    public ChatUser(String name){
        super(name);
    }
    
    @Override
    public void sendMessage(String message) {
        System.out.println(name + " sends: " + message);
        mediator.notify(message, this);
        
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " receives: " + message);
    }
    
    
    
}
