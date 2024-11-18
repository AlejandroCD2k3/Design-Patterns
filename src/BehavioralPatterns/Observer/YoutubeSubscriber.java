package BehavioralPatterns.Observer;

public class YoutubeSubscriber implements Subscriber{
    
    private String channelName;
    
    public YoutubeSubscriber(String channelName){
        this.channelName = channelName;
    }
    
    @Override
    public void update(String publisherName, String context) {
        System.out.println(String.format("%s new notification: %s has published a new video '%s'",channelName, publisherName, context));
    }
    
}
