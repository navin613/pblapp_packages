import java.util.*;

class ageLessThanException extends Exception{
    public ageLessThanException(){
        super();
        System.out.println("Age Must be greater than equal to 18");
    }
}

class ageGreaterThanException extends Exception{
    public ageGreaterThanException(){
        super();
        System.out.println("Age Must be less than equal to 60");
    }
}


public class ques8 {
    public static void main(String args[]){
        int flag = 0;
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        try{
            if(age<18)
                throw new ageLessThanException();
            if(age>=60)
                throw new ageGreaterThanException();
        }
        catch(ArrayIndexOutOfBoundsException e){
            flag = 1;
            System.out.println(e.getMessage());
        }
        catch(ageLessThanException e){
            flag = 1;
            System.out.println(e);
        }
        catch(ageGreaterThanException e){
            flag = 1;
            System.out.println(e);
        }
        
        if(flag==0){
            System.out.println("Name and age : "+name+" "+age);
        }
    }
}
