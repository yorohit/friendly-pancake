import java.util.List;

public class razorPay implements PaymentGateway{
    @Override
    public void addClient() {

    }

    @Override
    public void removeClient() {

    }

    @Override
    public boolean hasClient() {
        return false;
    }

    @Override
    public List<String> listSupportedPaymodes() {
        return null;
    }

    @Override
    public void addSupportForPaymode() {

    }

    @Override
    public void removePaymode() {

    }

    @Override
    public List<String> showDistribution() {
        return null;
    }

    @Override
    public void makePayment() {

    }
}
