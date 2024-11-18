package BehavioralPatterns.State;

public class HasCoinState implements CandyMachineState{
    
    private CandyMachine candyMachine;
    
    public HasCoinState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }

    @Override
    public void insertCoin(){
        System.out.println("Coin already inserted");
    }
    
    @Override
    public void ejectCoin(){
        System.out.println("Coin ejected");
        candyMachine.setState(candyMachine.getNoCoinState());
    }
    
    @Override
    public void turnCrank(){
        System.out.println("You turned the crank");
        candyMachine.setState(candyMachine.getDispensingState());
    }
    
    @Override
    public void dispenseCandy(){
        System.out.println("Turn the crank to dispense a candy");
    }
}
