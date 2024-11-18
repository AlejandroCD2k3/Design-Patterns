package Main;

import BehavioralPatterns.Observer.*;


public class Main {
    
    public static void main(String[] args){
        
        YoutubeChannel braisMoure = new YoutubeChannel("MoureDev");
        
        Subscriber ariadna123 = new YoutubeSubscriber("ariadna123");
        Subscriber preston48 = new YoutubeSubscriber("preston48");
        Subscriber proprogrammer = new YoutubeSubscriber("proprogrammer");
        
        braisMoure.subscribe(ariadna123);
        braisMoure.subscribe(preston48);
        braisMoure.subscribe(proprogrammer);
        
        braisMoure.uploadVideo("SOLID Principles from cero");
        
        braisMoure.unsubscribe(preston48);
        
        braisMoure.uploadVideo("Advanced web Python");
        
    }
 
}