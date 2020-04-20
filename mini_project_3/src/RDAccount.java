public class RDAccount extends Account {
    double interestRate;
    double amount;
    int noOfMonths;
    int ageOfACHolder;
    public void setValue(double amt,int months, int age) throws invalidMonthsException,invalidAgeException,invalidAmountException{
        amount = amt;
        noOfMonths = months;
        ageOfACHolder = age;
        if(ageOfACHolder>=60){
            if(months==6)
                interestRate = 8.00;
            else if(months==9)
                interestRate = 8.25;
            else if(months==12)
                interestRate = 8.50;
            else if(months==15)
                interestRate = 8.75;
            else if(months==18)
                interestRate = 9.00;
            else if(months==21)
                interestRate = 9.25;
            else{
                throw new invalidMonthsException();
            }
        }
        else{
            if(months==6)
                interestRate = 7.50;
            else if(months==9)
                interestRate = 7.75;
            else if(months==12)
                interestRate = 8.00;
            else if(months==15)
                interestRate = 8.25;
            else if(months==18)
                interestRate = 8.50;
            else if(months==21)
                interestRate = 8.75;
            else{
                throw new invalidMonthsException();
            }
        }
    }
    
    @Override 
    double calculateInterest(){
        double interest = (amount/100)*interestRate;
        return interest;
    }
}
