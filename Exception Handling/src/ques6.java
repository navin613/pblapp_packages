import java.util.*;

class negativeValues extends Exception{
    public negativeValues(){
        System.out.println("Negative values are not allowed.");
    }
}

class outOfBound extends Exception{
    public outOfBound(){
        System.out.println("Values Greater than 100 is not allowed.");
    }
}

public class ques6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        for(int i=0;i<2;i++){
            int a=0;
            int b=0;
            int c=0;
            System.out.println("Enter Name of Student "+(i+1));
            String s;
            s=sc.next();
            try{
                System.out.println("Enter marks of student :");
                if(sc.hasNextInt())
                    a = sc.nextInt();
                else
                    throw new NumberFormatException();
            
                if(sc.hasNextInt())
                    b = sc.nextInt();
                else
                    throw new NumberFormatException();
            
                if(sc.hasNextInt())
                    c = sc.nextInt();
                else
                    throw new NumberFormatException();
            
                if(a<0)
                    throw new negativeValues();
                if(b<0)
                    throw new negativeValues();
                if(c<0)
                    throw new negativeValues();
                if(a>100)
                    throw new outOfBound();
                if(b>100)
                    throw new outOfBound();
                if(c>100)
                    throw new outOfBound();
            }
            catch(NumberFormatException e){
                flag = 1;
                System.out.println(e);
            }
            catch(negativeValues e){
                flag = 1;
                System.out.println(e);
            }
            catch(outOfBound e){
                flag = 1;
                System.out.println(e);
            }
            if(flag==0){
                System.out.println("Name of student : "+s);
                System.out.println("Marks in 1st subject : "+a);
                System.out.println("Marks in 2nd subject : "+b);
                System.out.println("Marks in 3rd subject : "+c);
            }
        }
        
    }
}
