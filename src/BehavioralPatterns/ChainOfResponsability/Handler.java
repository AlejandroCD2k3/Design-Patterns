package BehavioralPatterns.ChainOfResponsability;

public interface Handler {
    
    public void setNextHandler(Handler handler);
    public void handleRequest(String request);
    
}
