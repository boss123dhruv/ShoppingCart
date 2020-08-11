public class DebitPaymentService extends PaymentService {

    @Override
    public void processAmount(double amount) {
        System.out.printf("Processing debit payment of $%.0f\n", amount);
    }

}