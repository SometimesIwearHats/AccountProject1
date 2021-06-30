import java.util.Date;

//Account class that saves number, balance, creation date of ALL accounts.
public class Account {
    private int number;
    private double balance;
    private Date creationDate;

    public Account() {
        number = 0;
        balance = 0.0;
        creationDate = new Date();
    }

    public Account(int number) {
        this.number = number;
        balance = 0.0;
        creationDate = new Date();
    }

    public double depositMoney(double amount) {
        balance += amount;
        return balance;
    }

    public double withdrawMoney(double amount) {
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Returns account number
    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Balance = " + balance);
        sb.append(", Account number = " + number);

        return sb.toString();
    }
}
