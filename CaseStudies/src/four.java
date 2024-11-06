class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayBalance() {
        System.out.println("Balance for account " + accountNumber + ": " + balance);
    }
}

class four {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("24113024", 700.0);
        account.displayBalance();
        account.deposit(750);
        account.displayBalance();
        account.withdraw(540);
        account.displayBalance();
        account.withdraw(1500);
    }
}
