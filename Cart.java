import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products = new ArrayList<Product>();
    private PaymentService service;
    public void setPaymentService(PaymentService service) {
        this.service = service;
}
    public void addProduct(Product product) {
        products.add(product);
}
    public void payCart() {
        double totalPrice = 0;
        for(int i = 0; i < products.size(); i++)
            totalPrice += products.get(i).getPrice();
        service.processAmount(totalPrice);
}
}
