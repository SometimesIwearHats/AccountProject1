public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount() {
        super();
        overdraftLimit = 50;
        setBalance(200);
    }

    public CurrentAccount(int number) {
        super(number);
        overdraftLimit = 50;
        setBalance(200);
    }

    public void setOverdraftBalance(double balance, int overdraftLimit) {
        double maximumBalance = balance + overdraftLimit;
        }

    public double getOverdraftBalance() {
        return overdraftLimit;
        }

    public double withdraw(double withdraw) {
        double newBalance = getBalance() - withdraw;
        double maximumBalance = getBalance() + overdraftLimit;

        //If client attempts to withdraw sum of money greater than (balance + overdraftLimit)
        //the transaction will be blocked and will return previous balance to amount before withdrawal attempt.

        if (withdraw > maximumBalance){
            System.out.println("Client tries to withdraw: " + withdraw + " - Operation not approved - Balance: " + getBalance());
        }

        else if (withdraw <= maximumBalance) {
            setBalance(newBalance);
            System.out.println("Client tries to withdraw: " + withdraw + " - Operation approved - Balance: " + getBalance());
        }
        return getBalance();
        }

        public String toString () {
            StringBuilder sb = new StringBuilder();

            sb.append("Balance: $" + getBalance());
            sb.append(" Overdraft: $" + overdraftLimit);
            sb.append(" (maximum available balance is $250)");
            return sb.toString();

        }
}
