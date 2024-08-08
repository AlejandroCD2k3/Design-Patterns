package CreationalPatterns.Prototype;

public class MinecraftSlime implements Prototype{
    
    private String size, kindOfSlime;
    private int healthPoints;
    
    public MinecraftSlime(MinecraftSlime prototype){
        this.size = prototype.size;
        this.kindOfSlime = prototype.kindOfSlime;
        this.healthPoints = prototype.healthPoints;
    }
    
    public MinecraftSlime(String size, String kindOfSlime, int healthPoints){
        this.size = size;
        this.kindOfSlime = kindOfSlime;
        this.healthPoints = healthPoints;
    }

    @Override
    public Prototype clone(){
        return new MinecraftSlime(this);
    }

    public String getSize() {
        return size;
    }

    public String getKindOfSlime() {
        return kindOfSlime;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
    
}
