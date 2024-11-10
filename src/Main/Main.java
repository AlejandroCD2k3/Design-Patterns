package Main;

import StructuralPatterns.Proxy.*;


public class Main {
    
    public static void main(String[] args){
        
        UserApplication myApp =  new AuthenticationProxy("admin","notMyPassword");
        System.out.println(myApp.getData());
        
        System.out.println("-------------------");
        
        myApp =  new AuthenticationProxy("admin","mySecurePassword");
        System.out.println(myApp.getData());
        
    }
 
}