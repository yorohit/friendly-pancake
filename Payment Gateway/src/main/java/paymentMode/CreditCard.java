package paymentMode;

import accountDetails.MethodDetails;
import bank.ProcessID;
import distribution.Distribution;

public class CreditCard implements PaymentMode{
    @Override
    public void makePayment(Distribution distribution, MethodDetails methodDetails, ProcessID processID) {

    }
}
