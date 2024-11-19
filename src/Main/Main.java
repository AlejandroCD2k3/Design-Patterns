package Main;

import BehavioralPatterns.TemplateMethod.*;


public class Main {
    
    public static void main(String[] args){
        
        Authentication authentication;
        
        System.out.println("Authenticating with Database:");
        authentication = new DatabaseAuthentication();
        authentication.authenticateUser("admin", "1234");
        
        System.out.println("---------------------------------");
        
        System.out.println("\nAuthenticating with LDAP:");
        authentication = new LDAPAuthentication();
        authentication.authenticateUser("user", "1234");
        
        System.out.println("---------------------------------");
        
        System.out.println("Authenticating invalid user");
        authentication.authenticateUser("notAValidUser", "notAValidPassword");
        
    }
 
}