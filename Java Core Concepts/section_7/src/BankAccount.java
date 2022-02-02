public class BankAccount {
    private String bankAccountHolderName;
    private int balance;

    BankAccount(String bankAccountHolderName){
        this(bankAccountHolderName,0);
    }
    BankAccount(String bankAccountHolderName,int balance){
        this.bankAccountHolderName = bankAccountHolderName;
        this.balance = balance;
    }
    public void deposit(int amount){
        if(amount > 0){
            balance += amount;
        }else {
            System.out.println("The amount should be greater than zero");
        }
    }
    public void withdraw(int amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }else {
            System.out.println("Insufficient balance");
        }
    }

    public String getBankAccountHolderName(){
        return this.bankAccountHolderName;
    }
    public int getBalance(){
        return this.balance;
    }
}
