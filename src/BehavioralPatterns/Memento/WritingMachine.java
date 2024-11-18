package BehavioralPatterns.Memento;

import java.util.ArrayList;
import java.util.List;

public class WritingMachine {
    
    private List<Memento> saves = new ArrayList<>();
    
    public void saveGame(Memento memento){
        saves.add(memento);
        System.out.println("Progress saved");
    }
    
    public void loadGame(int saveIndex){
        saves.get(saveIndex).restore();
    }
}
