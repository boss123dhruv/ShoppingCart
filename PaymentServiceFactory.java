public class PaymentServiceFactory {
    private static PaymentServiceFactory instance;

    private PaymentServiceFactory() {}
    public static PaymentServiceFactory getInstance() {
        if (instance == null);
          instance = new PaymentServiceFactory();
        return instance;
    }
    public PaymentService getPaymentService(PaymentServiceType type) {
        switch (type) {
            case DEBIT:
                return new DebitPaymentService();
            case CREDIT:
                return new CreditPaymentService();
        }
        return null;
    }
}