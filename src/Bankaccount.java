class ba{
    private double balance;  // nobody outside can do account.balance = -9999

    ba(double initialBalance) {
        if (initialBalance < 0) {
            this.balance = 0;  // silent fix, or you could throw an exception later
        } else {
            this.balance = initialBalance;
        }
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit must be positive.");
            return;
        }
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
    }

    double getBalance() { return balance; }
    }
    public class Bankaccount {
    public static void main(String[] args) {
        ba acc = new ba(1000);
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(2000);  // should print "Insufficient funds"
        System.out.println("Balance: " + acc.getBalance()); // 1300.0

    }
}