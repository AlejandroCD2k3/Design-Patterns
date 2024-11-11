package BehavioralPatterns.ChainOfResponsability;

public class SpecializedEngenieer extends SupportHandler{
    
    @Override
    public void handleRequest(String request){
        if(request.equals("advanced")){
            System.out.println("Engenieering team solving your issue...");
            System.out.println("Your issue has been solved");
        }else if(nextHandler != null){
            System.out.println("Transfering...");
            nextHandler.handleRequest(request);
        }else{
            System.out.println("We were unable to resolve your problem. Please visit a local branch for assistance");
        }
    }
    
}
