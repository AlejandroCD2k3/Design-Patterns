package BehavioralPatterns.TemplateMethod;

public class LDAPAuthentication extends Authentication{
    
    @Override
    protected boolean validateCredentials(String username, String password){
        System.out.println("Validating credentials in LDAP server...");
        return "user".equals(username) && "1234".equals(password);
    }
    
}
