package BehavioralPatterns.State;

public class NoCoinState implements CandyMachineState{
    
    private CandyMachine candyMachine;
    
    public NoCoinState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }
    
    @Override
    public void insertCoin(){
        System.out.println("You inserted a coin");
        candyMachine.setState(candyMachine.getHasCoinState());
    }
    
    @Override
    public void ejectCoin(){
        System.out.println("There's no coin to eject");
    }
    
    @Override
    public void turnCrank(){
        System.out.println("You need to insert a coin first");
    }
    
    @Override
    public void dispenseCandy(){
        System.out.println("You need to insert a coin first");
    }
    
}
