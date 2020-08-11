import java.io.File;

public class ShoppingCartDemo {

    public static void main(String[] args) {

        File file = new File("ShoppingCartDemo.java");
        String absolutePath = file.getAbsolutePath();

        System.out.println(absolutePath);

        PaymentServiceFactory factory = PaymentServiceFactory.getInstance();
        PaymentService creditService = factory.getPaymentService(PaymentServiceType.CREDIT);
        PaymentService debitService = factory.getPaymentService(PaymentServiceType.DEBIT);

        Cart cart = new Cart();
        cart.addProduct(new Product("shirt", 50));
        cart.addProduct(new Product("pants", 60));

        cart.setPaymentService(creditService);
        cart.payCart();

        cart.setPaymentService(debitService);
        cart.payCart();
    }

}