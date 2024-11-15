package Main;

import BehavioralPatterns.Mediator.*;


public class Main {
    
    public static void main(String[] args){
        
        ChatMediator chatMediator = new ChatMediator();
        
        User michael = new ChatUser("Michael");
        User allison = new ChatUser("Allison");
        User claire = new ChatUser("Claire");
        
        chatMediator.addUser(michael);
        chatMediator.addUser(allison);
        chatMediator.addUser(claire);
        
        allison.sendMessage("Hello everyone! This is my first message");
        
    }
 
}