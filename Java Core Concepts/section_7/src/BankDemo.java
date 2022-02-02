public class BankDemo {
    public static void main(String[] args) {
        BankAccount account_1 = new BankAccount("John",15000);
        BankAccount account_2 = new BankAccount("Bob",25620);

        printDetails(account_1);
        System.out.println();
        printDetails(account_2);

        account_1.deposit(2000);
        account_2.withdraw(200);

        printDetails(account_1);
        System.out.println();
        printDetails(account_2);
    }
    public static void printDetails(BankAccount bankAccount){
        System.out.println("owner : " + bankAccount.getBankAccountHolderName());
        System.out.println("Balance : " + bankAccount.getBalance());
    }
}
