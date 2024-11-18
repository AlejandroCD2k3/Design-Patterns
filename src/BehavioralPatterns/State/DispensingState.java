package BehavioralPatterns.State;

public class DispensingState implements CandyMachineState{
    
    private CandyMachine candyMachine;
    
    public DispensingState(CandyMachine candyMachine){
        this.candyMachine = candyMachine;
    }
    
    @Override
    public void insertCoin(){
        System.out.println("Please wait before inserting another coin");
    }
    
    @Override
    public void ejectCoin(){
        System.out.println("There's no coin to eject");
    }
    
    @Override
    public void turnCrank(){
        System.out.println("Crank already turned");
    }
    
    @Override
    public void dispenseCandy(){
        System.out.println("Enjoy your candy!");
        candyMachine.releaseCandy();
        if(candyMachine.getCandyCount() > 0){
            candyMachine.setState(candyMachine.getNoCoinState());
        }else{
            System.out.println("Machine's out of candies!");
            candyMachine.setState(candyMachine.getSoldOutState());
        }
    }
    
}
