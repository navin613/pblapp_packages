import java.util.*;

public class ques4 {
    public static void main(String args[]){
        int n = args.length;
        int sum = 0;
        double avg = 0;
        int a[] = new int[n];
        try{
            for(int i=0;i<n;i++){
                a[i] = Integer.parseInt(args[i]);
            }
            for(int i=0;i<n;i++){
                sum += a[i];
            }
            avg = (double)sum / n;
        }
        catch (NumberFormatException e){
            System.out.println("NumberFormatException");
	} 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
	} 
        catch (InputMismatchException e) {
            System.out.println("InputMismatchException");
        }

	System.out.println("sum: " + sum);
	System.out.println("avg: " + avg);
    }
}
