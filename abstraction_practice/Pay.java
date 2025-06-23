package abstraction;

abstract class Payment {
    abstract void pay(double amount);
}

class CreditCard extends Payment {
    void pay(double amount) {
        System.out.println("Paid $" + amount + " using credit card.");
    }
}

class PayPal extends Payment {
    void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

public class Pay {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        PayPal payPal = new PayPal();

        creditCard.pay(100.50);  
        payPal.pay(75.25);       
    }
}
