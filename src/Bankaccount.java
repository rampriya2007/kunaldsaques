//class ba{
//    private double balance;  // nobody outside can do account.balance = -9999
//
//    ba(double initialBalance) {
//        if (initialBalance < 0) {
//            this.balance = 0;  // silent fix, or you could throw an exception later
//        } else {
//            this.balance = initialBalance;
//        }
//    }
//
//    void deposit(double amount) {
//        if (amount <= 0) {
//            System.out.println("Deposit must be positive.");
//            return;
//        }
//        balance += amount;
//    }
//
//    void withdraw(double amount) {
//        if (amount <= 0) {
//            System.out.println("Withdrawal must be positive.");
//            return;
//        }
//        if (amount > balance) {
//            System.out.println("Insufficient funds.");
//            return;
//        }
//        balance -= amount;
//    }
//
//    double getBalance() { return balance; }
//    }
//    public class Bankaccount {
//    public static void main(String[] args) {
//        ba acc = new ba(1000);
//        acc.deposit(500);
//        acc.withdraw(200);
//        acc.withdraw(2000);  // should print "Insufficient funds"
//        System.out.println("Balance: " + acc.getBalance()); // 1300.0
//
//    }
//}


public class Bankaccount {
    private double balance;
    private String owner;

    // Master constructor — all validation lives here
    Bankaccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance < 0 ? 0 : initialBalance;
    }

    // Convenience constructor — no balance provided, defaults to 0
    Bankaccount(String owner) {
        this(owner, 0);  // calls the master constructor above
    }

    // Convenience constructor — no owner, anonymous account
    Bankaccount() {
        this("Anonymous", 0);  // chains up again
    }

    void deposit(double amount) {
        if (amount <= 0) { System.out.println("Invalid amount"); return; }
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= 0 || amount > balance) { System.out.println("Invalid"); return; }
        balance -= amount;
    }

    double getBalance() { return balance; }

    public static void main(String[] args) {
        Bankaccount a = new Bankaccount("Rampriya", 5000);
        Bankaccount b = new Bankaccount("Priya");   // balance = 0
        Bankaccount c = new Bankaccount();           // anonymous, balance = 0

        a.deposit(1000);
        System.out.println(a.getBalance()); // 6000
        System.out.println(b.getBalance()); // 0
        System.out.println(c.getBalance());
    }
}