package BehavioralPatterns.ChainOfResponsability;

public class SupportAgent extends SupportHandler{
    
    @Override
    public void handleRequest(String request){
        if(request.equals("intermediate")){
            System.out.println("Support agent solving your issue...");
            System.out.println("Your issue has been solved");
        }else if(nextHandler != null){
            System.out.println("Transfering...");
            nextHandler.handleRequest(request);
        }else{
            System.out.println("We were unable to resolve your problem. Please visit a local branch for assistance");
        }
    }
    
}
