import java.util.*;

public class ques3 {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        n = sc.nextInt();
        System.out.println("Enter the elements in the array");
        int a[] = new int[n];
        try{
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            System.out.println("Enter the index of the array element you want to access");
            int temp = sc.nextInt();
            
            System.out.println("The array element at index "+temp+" = "+a[temp]);
            System.out.println("The array element successfully accessed");
        }
        catch(ArrayIndexOutOfBoundsException | InputMismatchException e){
                System.out.println(e);
        }
    }
}
