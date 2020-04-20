abstract class GeneralBank{
    GeneralBank(){};
    abstract double getSavingsInterestRate();
    abstract double getFixedDepositInterestRate();
}

abstract class ICICIBank extends GeneralBank{
    ICICIBank(){super();}
    @Override
    double getSavingsInterestRate(){
        System.out.print("Saving Interest Rate is : ");
        return 4;
    }
    @Override
    double getFixedDepositInterestRate(){
        System.out.print("Fixed Deposit Interest Rate is : ");
        return 8.5;
    }
}

abstract class KotMBank extends GeneralBank{
    KotMBank(){super();}
    @Override
    double getSavingsInterestRate(){
        System.out.print("Saving Interest Rate is : ");
        return 6;
    }
    @Override
    double getFixedDepositInterestRate(){
        System.out.print("Fixed Deposit Interest Rate is : ");
        return 9;
    }
}
public class Testbank {
    public static void main(String args[]){
        ICICIBank i = new ICICIBank() {};
        KotMBank k = new KotMBank() {};
        GeneralBank g1 = new KotMBank() {};
        GeneralBank g2 = new ICICIBank() {};
        System.out.println(i.getSavingsInterestRate());
        System.out.println(i.getFixedDepositInterestRate());
        System.out.println(k.getSavingsInterestRate());
        System.out.println(k.getFixedDepositInterestRate());
        System.out.println(g1.getSavingsInterestRate());
        System.out.println(g1.getFixedDepositInterestRate());
        System.out.println(g2.getSavingsInterestRate());
        System.out.println(g2.getFixedDepositInterestRate());
    }
}
