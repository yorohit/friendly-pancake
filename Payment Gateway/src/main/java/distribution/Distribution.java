package distribution;

import java.util.List;

public class Distribution {
    private final List<String> bankAccounts;
    private final List<Double> percentages;

    public Distribution(List<String> bankAccounts, List<Double> percentages) {
        this.bankAccounts = bankAccounts;
        this.percentages = percentages;
    }

    public List<Double> getPercentages() {
        return percentages;
    }

    public List<String> getBankAccounts() {
        return bankAccounts;
    }
}
