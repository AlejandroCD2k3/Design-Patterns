package BehavioralPatterns.Mediator;

public abstract class User {
    
    protected MessageMediator mediator;
    protected String name;
    
    public User(String name){
        this.name = name;
    }
    
    public void setMediator(MessageMediator mediator){
        this.mediator = mediator;
    }
    
    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
    
}
