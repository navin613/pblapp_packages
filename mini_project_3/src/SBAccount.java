public class SBAccount extends Account{
    double interestRate;
    double amount;
    String typeOfAccount;
    public void setValue(double amt,String acc){
        amount = amt;
        typeOfAccount = acc;
        if(typeOfAccount.equals("Normal")){
            interestRate = 4.0;
        }
        else{
            interestRate = 6.0;
        }
    }
    
    @Override 
    double calculateInterest(){
        double interest = (amount/100)*interestRate;
        return interest;
    }
}
