import java.util.*;

class invalidDaysException extends Exception{
    public invalidDaysException(){
        super();
        System.out.println("Invalid Number of days.Please enter non-negative values.");
    }
}

class invalidMonthsException extends Exception{
    public invalidMonthsException(){
        super();
        System.out.println("Invalid Number of months.Please enter non-negative values.");
    }
}

class invalidAmountException extends Exception{
    public invalidAmountException(){
        super();
        System.out.println("Invalid Amount.Please enter non-negative values.");
    }
}

class invalidAgeException extends Exception{
    public invalidAgeException(){
        super();
        System.out.println("Invalid Age.Please enter non-negative values.");
    }
}

public class testAccount {
    public static void main(String args[]) throws invalidDaysException, invalidMonthsException, invalidAgeException, invalidAmountException{
        Scanner sc = new Scanner(System.in);
        SBAccount sb = new SBAccount();
        FDAccount fd = new FDAccount();
        RDAccount rd = new RDAccount();
        int c;
        do{
            System.out.println("MAIN MENU");
            System.out.println("---------");
            System.out.println("    1. Interest Calculator - SB");
            System.out.println("    2. Interest Calculator - FD");
            System.out.println("    3. Interest Calculator - RD");
            System.out.println("    4. Exit");
            System.out.print("Enter your option (1..4) : ");
            c = sc.nextInt();
            switch(c){
                case 1:
                    System.out.print("Enter the Average amount in your account : ");
                    double amt = sc.nextDouble();
                    System.out.print("Enter the type of account : NRI or Normal : ");
                    String s = sc.next();
                    sb.setValue(amt, s);
                    System.out.print("Interest gained: Rs. ");
                    System.out.println(sb.calculateInterest());
                    break;
                case 2:
                    System.out.print("Enter the FD amount:");
                    double amt2 = sc.nextDouble();
                    System.out.print("Enter the number of days:");
                    int d = sc.nextInt();
                    System.out.print("Enter your age:");
                    int a = sc.nextInt();
                    fd.setValue(amt2, d, a);
                    System.out.println();
                    System.out.print("Interest gained is: Rs. ");
                    System.out.println(fd.calculateInterest());
                    break;
                case 3:
                    System.out.print("Enter the RD amount:");
                    double amt3 = sc.nextDouble();
                    System.out.print("Enter the number of months:");
                    int m = sc.nextInt();
                    System.out.print("Enter your age:");
                    int ag = sc.nextInt();
                    rd.setValue(amt3, m, ag);
                    System.out.println();
                    System.out.print("Interest gained is: Rs. ");
                    System.out.println(rd.calculateInterest());
                    break;
                case 4:
                    System.out.println("Thanks for usinf application.");
                    System.exit(1);
                    break;
                default:
                    System.out.println("You entered Invalid choice.");
                    break;
            }
        }while(c!=4);
    }
    
}
