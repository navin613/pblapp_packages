import java.util.*;

public class ques5 {
    public double division(int a, int b) throws ArithmeticException {
        return a/b;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ques5 obj = new ques5();
        try{
            System.out.println(obj.division(a,b));
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
