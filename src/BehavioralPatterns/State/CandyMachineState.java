package BehavioralPatterns.State;

public interface CandyMachineState {
    
    public void insertCoin();
    public void ejectCoin();
    public void turnCrank();
    public void dispenseCandy();
    
}
