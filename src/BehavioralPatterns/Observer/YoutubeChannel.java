package BehavioralPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Publisher{

    private String channelName;
    private List<Subscriber> subscribers = new ArrayList<>();
    
    public YoutubeChannel(String channelName){
        this.channelName = channelName;
    }
    
    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String context) {
        for(Subscriber subscriber: subscribers){
            subscriber.update(channelName, context);
        }
    }
    
    public void uploadVideo(String videoTitle){
        notifySubscribers(videoTitle);
    }
    
}
