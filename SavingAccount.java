package JavaCodingPractice60;

public class SavingAccount extends BankAccount{
    double interestRate;

    public SavingAccount(int accountNumber, double balance, double interestRate) { // Create constructor
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                '}';
    }
}

