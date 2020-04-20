import java.util.*;

class InvalidCountryException extends Exception{
    public InvalidCountryException(){
        super();
        System.out.println("User Outside India  cannot be registered");
    }
}

public class ques7 {
    public static void registerUser(String username,String userCountry) throws InvalidCountryException{
        if(!userCountry.equals("India")){
                throw new InvalidCountryException();
        }
        else
            System.out.println("User registration done successfully");
    }
    public static void main(String args[]){
        try{
            registerUser("abc","India");
        }
        catch(InvalidCountryException e){
            System.out.println(e);
        }
    }
}
