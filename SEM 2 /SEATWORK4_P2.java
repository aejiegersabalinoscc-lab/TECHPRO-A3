public class SEATWORK4_P2 {

    public void processPayment(double amount, String currency) {
        System.out.println("Processing payment of " + amount + " " + currency);
    }

    public void processPayment(double amount, String currency, String paymentMethod) {
        System.out.println("Processing payment of " + amount + " " + currency + " via " + paymentMethod);
    }

    public static void main(String[] args) {

        Seatwork4B obj = new Seatwork4B();

        obj.processPayment(500.0, "EURO");

        obj.processPayment(1200.50, "USD", "Credit Card");
    }
}
