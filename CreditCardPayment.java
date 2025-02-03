public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void pay() {
        System.out.println("paga con carta di credito");
    }
}
