package BehavioralPatterns.ChainOfResponsability;

public abstract class SupportHandler implements Handler{
    
    protected Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public abstract void handleRequest(String request);
    
    
    
}
