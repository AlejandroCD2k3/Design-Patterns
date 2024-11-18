package BehavioralPatterns.State;

public class CandyMachine {
    
    private CandyMachineState noCoinState;
    private CandyMachineState hasCoinState;
    private CandyMachineState dispensingState;
    private CandyMachineState soldOutState;
    
    private CandyMachineState currentState;
    private int candyQuantity;
    
    public CandyMachine(int candyQuantity){
        
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        dispensingState = new DispensingState(this);
        soldOutState = new SoldOutState(this);
        
        this.candyQuantity = candyQuantity;
        
        if(candyQuantity > 0){
            currentState = noCoinState;
        }else{
            candyQuantity = 0;
            currentState = soldOutState;
        }
        
    }
    
    // ---------------- TRANSITIONS ----------------
    
    public void insertCoin(){
        currentState.insertCoin();
    }
    
    public void ejectCoin(){
        currentState.ejectCoin();
    }
    
    public void turnCrank(){
        currentState.turnCrank();
    }
    
    public void dispenseCandy(){
        currentState.dispenseCandy();
    }
    
    public void releaseCandy(){
        candyQuantity --;
    }
    
    // ---------------- STATE SETTER ----------------
    
    public void setState(CandyMachineState newState){
        this.currentState = newState;
    }
    
    // ---------------- GETTERS ----------------
    
    public CandyMachineState getNoCoinState() {
        return noCoinState;
    }

    public CandyMachineState getHasCoinState() {
        return hasCoinState;
    }

    public CandyMachineState getDispensingState() {
        return dispensingState;
    }

    public CandyMachineState getSoldOutState() {
        return soldOutState;
    }

    public int getCandyCount() {
        return candyQuantity;
    }
    
}
