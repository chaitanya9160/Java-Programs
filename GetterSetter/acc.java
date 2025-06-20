class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class acc{
    public static void main(String[] args) {
        Account a = new Account();
        a.setBalance(15000.50);
        System.out.println("Balance: " + a.getBalance());
    }
}
