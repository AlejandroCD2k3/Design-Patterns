package StructuralPatterns.Bridge;

public class SmallSize implements Size{
    
    private int chestSize = 90;
    private int waistSize = 70;

    @Override
    public String getDescription() {
       return String.format("Size S:\n Chest %dcm\n Waist %dcm", chestSize, waistSize);
    }
    
    public int getChestSize(){
        return chestSize;
    }
    
    public int getWaistSize(){
        return waistSize;
    }
    
}
