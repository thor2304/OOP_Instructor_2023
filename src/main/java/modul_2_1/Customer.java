package modul_2_1;

public class Customer {
    String name;
    int id;
    double balance;

    public Customer(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public Customer(String name, int id) {
        this(name, id, 0.0);
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance){
            throw new IllegalArgumentException("Amount must be less than balance");
        }
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Balance: " + balance;
    }
}
