package bank;

import java.util.HashMap;
import java.util.Map;

public class ProcessID {
    final Map<String, BankAccount> creditIDMap;
    final Map<String, BankAccount> upiIDMap;

    public void addCreditAccount(String cardNumber, BankAccount account){
        creditIDMap.put(cardNumber, account);
    }

    public void addupiAccount(String updNumber, BankAccount account){
        upiIDMap.put(updNumber, account);
    }

    public BankAccount getCreditCardAccount(String cardNumber){
        return creditIDMap.getOrDefault(cardNumber, new BankAccount());
    }

    public BankAccount getUPIAccount(String upiNumber){
        return upiIDMap.getOrDefault(upiNumber, new BankAccount());
    }

    public ProcessID() {
        creditIDMap = new HashMap<>();
        upiIDMap = new HashMap<>();
    }
}
