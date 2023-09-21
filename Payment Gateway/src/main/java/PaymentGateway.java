import java.util.List;

public interface PaymentGateway {
    void addClient();
    void removeClient();
    boolean hasClient();
    List<String> listSupportedPaymodes();
    void addSupportForPaymode();
    void removePaymode();
    List<String> showDistribution();
    void makePayment();
}
