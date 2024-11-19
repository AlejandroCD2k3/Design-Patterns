package BehavioralPatterns.TemplateMethod;

public abstract class Authentication{
    
    public final void authenticateUser(String username, String password){
        connect();
        boolean authenticated = validateCredentials(username, password);
        
        if(authenticated){
            System.out.println("Authentication successful");
        }else{
            System.out.println("Invalid credentials");
        }
        
        closeConnection();
    }
    
    private void connect(){
        System.out.println("Establishing connection...");
    }
    
    private void closeConnection(){
        System.out.println("Closing connection");
    }
    
    protected abstract boolean validateCredentials(String username, String password);
    
}
