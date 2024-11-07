package StructuralPatterns.Bridge;

public class LargeSize implements Size{
    
    private int chestSize = 110;
    private int waistSize = 90;

    @Override
    public String getDescription() {
       return String.format("Size L:\n Chest %dcm\n Waist %dcm", chestSize, waistSize);
    }
    
    public int getChestSize(){
        return chestSize;
    }
    
    public int getWaistSize(){
        return waistSize;
    }
    
}
