package paymentMode;

import accountDetails.MethodDetails;
import bank.ProcessID;
import distribution.Distribution;

public interface PaymentMode {
    void makePayment(Distribution distribution, MethodDetails methodDetails, ProcessID processID);
}
