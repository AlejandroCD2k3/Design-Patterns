package BehavioralPatterns.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements MessageMediator{

    private List<User> users;
    
    public ChatMediator(){
        this.users = new ArrayList<>();
    }
    
    public void addUser(User user){
        this.users.add(user);
        user.setMediator(this);
    }
    
    @Override
    public void notify(String message, User sender) {
        for(User user : users){
            if(user != sender){
                user.receiveMessage(message);
            }
        }
    }
    
}
