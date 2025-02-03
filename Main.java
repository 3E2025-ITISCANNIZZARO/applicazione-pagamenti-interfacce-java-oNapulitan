public class Main {
    public static void main(String[] args) {
        ShoppingCart payPall = new ShoppingCart(new PayPalPayment());
        payPall.paga();
        ShoppingCart americanExpress = new ShoppingCart(new CreditCardPayment());
        americanExpress.paga();
    }
}