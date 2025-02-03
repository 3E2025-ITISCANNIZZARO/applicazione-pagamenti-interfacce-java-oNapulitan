public class ShoppingCart {
    PaymentStrategy metodo;
    ShoppingCart(PaymentStrategy pagamento) {
        metodo = pagamento;
    }

    void paga() {
        metodo.pay();
    }
}
