package lab4;

public class task1 {

    abstract static class BankAccount {
        private double balance;
        private double accNumber;

        BankAccount(double balance, double accNumber) {
            this.balance = balance;
            this.accNumber = accNumber;
        }

        abstract void withdraw(int x);

        void deposit(double amount) {
            balance = balance + amount;
        }

        double getbalance() {
            return balance;
        }

        void setbalance(double amount) {
            balance = amount;
        }
    }

    static class SavingsAccount extends BankAccount {

        SavingsAccount(double bal, double acc) {
            super(bal, acc);
        }

        void withdraw(int x) {
            if (getbalance() - x < 500) {
                System.out.println("Minimum balance of 500 required");
            } else {
                setbalance(getbalance() - x);
            }
        }
    }

    static class CurrentAccount extends BankAccount {

        CurrentAccount(double bal, double acc) {
            super(bal, acc);
        }

        void withdraw(int x) {
            if (getbalance() - x >= -2000) {
                setbalance(getbalance() - x);
            } else {
                System.out.println("Overdraft limit exceeded");
            }
        }
    }

    public static void main(String[] args) {
        CurrentAccount c = new CurrentAccount(1000, 102);
        SavingsAccount s = new SavingsAccount(1000, 101);

        c.withdraw(2500);
        s.withdraw(500);

        System.out.println("Current Balance: " + c.getbalance());
        System.out.println("Savings Balance: " + s.getbalance());
    }
}