import java.util.*;

public class ques9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("The quotient of "+a+"/"+b+" = "+(a/b));
        }
        catch(ArithmeticException e){
            System.out.println("DivideByZeroException caught");
        }
        finally{
            System.out.println("Inside finally block");
        }
    }
}
