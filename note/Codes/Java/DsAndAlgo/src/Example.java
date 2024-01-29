abstract class Account {
    protected String accountNumber;
    protected double balance;
    public Account() {}

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    abstract void withdraw(double amount);
    void deposit(double amount) {balance+=amount;}
    void viewDetails(){
        System.out.println("Account "+accountNumber+ " has balance of "+ balance);
    }
}
class SavingsAccount extends Account{
    SavingsAccount(String accountNumber,double balance) {
        super(accountNumber, balance);
    }
    @Override
    void withdraw(double amount) {
        if(balance>amount)balance -= amount;
        else System.out.println("Insufficient balance");
    }

}
class OverDraftAccount extends Account {
    double overdraftValue;
    public OverDraftAccount(double overdraftValue, double balance, String accountNumber) {
        super(accountNumber, balance);
        this.overdraftValue = overdraftValue;
    }

    @Override
    void withdraw(double amount) {
        if(balance+overdraftValue>amount)balance -= amount;
        else System.out.println("Insufficient Balance");
    }
}

public class Example {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("1152697562325", 1000);
        OverDraftAccount overDraftAccount = new OverDraftAccount(5000,2000,"5896321752642");
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        overDraftAccount.deposit(4000);
        overDraftAccount.withdraw(2500);
        savingsAccount.viewDetails();
        overDraftAccount.viewDetails();
    }
}
