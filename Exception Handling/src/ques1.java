import java.util.*;

public class ques1 {
    public static void main(String args[]){
        String s;
        System.out.println("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        try{
            int n = Integer.parseInt(s);
            System.out.println("The square value is "+n*n);
            System.out.println("The work has been done successfully");
        }
        catch(NumberFormatException e){
            System.out.println("Entered input is not a valid format for an integer.");
        }
    }
}
