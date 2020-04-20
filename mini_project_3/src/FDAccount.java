public class FDAccount extends Account {
    double interestRate;
    double amount;
    int noOfDays;
    int ageOfACHolder;
    public void setValue(double amt,int days, int age) throws invalidDaysException{
        amount = amt;
        noOfDays = days;
        ageOfACHolder = age;
        
        if(amount<10000000 && ageOfACHolder>=60){
            if(noOfDays>=7 && noOfDays<=14)
                interestRate = 5.00;
            else if(noOfDays>=15 && noOfDays<=29)
                interestRate = 5.25;
            else if(noOfDays>=30 && noOfDays<=45)
                interestRate = 6.00;
            else if(noOfDays>=45 && noOfDays<=60)
                interestRate = 7.50;
            else if(noOfDays>=61 && noOfDays<=184)
                interestRate = 8.00;
            else if(noOfDays>=185 && noOfDays<=365)
                interestRate = 8.50;
            else
                throw new invalidDaysException();
        }
        
        else if(amount<10000000 && ageOfACHolder<60){
            if(noOfDays>=7 && noOfDays<=14)
                interestRate = 4.50;
            else if(noOfDays>=15 && noOfDays<=29)
                interestRate = 4.75;
            else if(noOfDays>=30 && noOfDays<=45)
                interestRate = 5.50;
            else if(noOfDays>=45 && noOfDays<=60)
                interestRate = 7.00;
            else if(noOfDays>=61 && noOfDays<=184)
                interestRate = 7.50;
            else if(noOfDays>=185 && noOfDays<=365)
                interestRate = 8.00;
            else
                throw new invalidDaysException();
        }
        else{
            if(noOfDays>=7 && noOfDays<=14)
                interestRate = 6.50;
            else if(noOfDays>=15 && noOfDays<=29)
                interestRate = 6.75;
            else if(noOfDays>=30 && noOfDays<=45)
                interestRate = 6.75;
            else if(noOfDays>=45 && noOfDays<=60)
                interestRate = 8.00;
            else if(noOfDays>=61 && noOfDays<=184)
                interestRate = 8.50;
            else if(noOfDays>=185 && noOfDays<=365)
                interestRate = 10.00;
            else
                throw new invalidDaysException();
        }
    }
    
    @Override
    double calculateInterest(){
        double interest = (amount/100)*interestRate;
        return interest;
    }
}
