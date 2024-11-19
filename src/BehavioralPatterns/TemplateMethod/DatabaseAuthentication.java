package BehavioralPatterns.TemplateMethod;

public class DatabaseAuthentication extends Authentication{
    
    @Override
    protected boolean validateCredentials(String username, String password){
        System.out.println("Validating credentials in database...");
        return "admin".equals(username) && "1234".equals(password);
    }
    
}
