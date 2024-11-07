
package StructuralPatterns.Bridge;


public class MediumSize implements Size{
    
    private int chestSize = 100;
    private int waistSize = 80;

    @Override
    public String getDescription() {
       return String.format("Size M:\n Chest %dcm\n Waist %dcm", chestSize, waistSize);
    }
    
    public int getChestSize(){
        return chestSize;
    }
    
    public int getWaistSize(){
        return waistSize;
    }
    
}
