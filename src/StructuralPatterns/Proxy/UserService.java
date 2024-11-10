package StructuralPatterns.Proxy;

public class UserService implements UserApplication{

    @Override
    public String getData() {
        System.out.println("Loading data...");
        return "token: tokenID, name: username, email: userMail@mail.com";
    }
    
}
