package StructuralPatterns.Proxy;

public class AuthenticationProxy implements UserApplication{

    private UserService userService;
    private String username;
    private String password;
    
    public AuthenticationProxy(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    private boolean areCredentialsCorrect(){
        return username.equals("admin") && password.equals("mySecurePassword"); // Fake user authentication
    }
    
    @Override
    public String getData() {
        if(!areCredentialsCorrect()){
            System.out.println("Access denied: Incorrect credentials");
            return null;
        }
        if(userService == null){
            System.out.println("Accessing data service...");
            userService = new UserService();
        }
        
        return userService.getData();
    }
    
}
