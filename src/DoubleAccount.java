public class DoubleAccount extends Account {
    private double doubleBalance;

    public DoubleAccount() {
        super();
        doubleBalance = 0;
    }

    public DoubleAccount(int number) {
        super(number);
        doubleBalance = 0;
    }

    public double withdrawFromDouble(double amount) {
        doubleBalance -= amount;
        return doubleBalance;
    }

    public double depositToDouble(double amount) {
        doubleBalance += amount;
        return doubleBalance;
    }

    public double getTotalBalance() {
        return doubleBalance + getBalance();
    }

    //I thought it was redundant because parent has this information.
    /*public int getNumber() {
        return getNumber();
    }*/

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append(" DoubleBalance: " + doubleBalance);
        sb.append(" Total Balance: " + getTotalBalance());
        return sb.toString();
    }
}
