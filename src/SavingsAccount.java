public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount() {
        super();
        interestRate = 0;
    }

    public SavingsAccount(int number, double interestRate) {
        super(number);

        if (interestRate < 0 || interestRate > 1) {
            this.interestRate = 0;
        }
        else {
            this.interestRate = interestRate;
        }
    }

    public void setInterestRate(double interestRate) {

        if (interestRate < 0 || interestRate > 1) {
            this.interestRate = 0;
        }
        else {
            this.interestRate = interestRate;
        }
    }

    public double getInterest() {
        return interestRate;
    }

    public double addInterestToAccount(double interestRate) {

        if ((interestRate < 0) || (interestRate > 1)) {
            this.interestRate = 0;
        }
        else {
            this.interestRate = interestRate;
        }

        return getBalance() * (interestRate + 1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        //sb.append(super.toString());
        sb.append(" Balance: $" + getBalance());
        sb.append(" Interest: " + interestRate + " (which is " + interestRate*100 + ")");
        sb.append("\n Interest added to account: " + getBalance() + "*" + interestRate + " = " + interestRate*100);
        sb.append("\n New Balance $" + (getBalance()+(interestRate*getBalance())));
        return sb.toString();

    }
}
