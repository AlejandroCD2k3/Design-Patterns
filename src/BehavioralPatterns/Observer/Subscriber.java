package BehavioralPatterns.Observer;

public interface Subscriber {
    
    public void update(String publisherName, String context);
    
}
