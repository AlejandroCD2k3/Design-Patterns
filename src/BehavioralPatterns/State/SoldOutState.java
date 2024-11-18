package BehavioralPatterns.State;

public class SoldOutState implements CandyMachineState{
    
    private CandyMachine candyMachine;
    
    public SoldOutState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }
    
    @Override
    public void insertCoin(){
        System.out.println("No candies available. Can't accept a coin.");
    }
    
    @Override
    public void ejectCoin(){
        System.out.println("No coin to eject.");
    }
    
    @Override
    public void turnCrank(){
        System.out.println("No candies to dispense.");
    }
    
    @Override
    public void dispenseCandy(){
        System.out.println("No candies to dispense.");
    }
    
}
