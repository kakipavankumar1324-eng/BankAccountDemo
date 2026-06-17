class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Invalid initial balance. Balance set to 0.");
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }
}
public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("ACC1001", 5000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: " + account.getBalance());

        account.setBalance(7500);
        System.out.println("Updated Balance: " + account.getBalance());

        account.setBalance(-1000);
    }
}