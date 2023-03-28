package level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요:");
        long income = sc.nextLong();
        System.out.printf("[세율에 의한 세금]:      %8d%n", taxCalculator.calc(income));
        System.out.printf("[누진공세 계산에 의한 세금]:%8d%n", taxCalculator.calcWithProgressiveTax(income));
    }
}

class TaxCalculator {
    private final List<TaxRate> taxRates;

    public TaxCalculator() {
        this.taxRates = Arrays.stream(TaxRate.values())
                .collect(Collectors.toList());

    }

    //가장 높은 세금비율 계산전 남은 income 이 중요(그전까진 세율에 따라 고정된 결과로 계산된다)
    public long calc(long income) {
        List<TaxRate> appliedTaxRates = getAppliedTaxRates(income);
        return appliedTaxRates.stream()
                .limit(appliedTaxRates.size() - 1)
                .mapToLong(taxRate -> taxRate.calc(income))
                .sum()
                + appliedTaxRates.get(appliedTaxRates.size() - 1)
                .calc(income);
    }

    public long calcWithProgressiveTax(long income) {
        List<TaxRate> appliedTaxRates = getAppliedTaxRates(income);
        TaxRate taxRate = appliedTaxRates.get(appliedTaxRates.size() - 1);
        return taxRate.calcWithProgressiveTax(income);
    }

    private List<TaxRate> getAppliedTaxRates(long income) {
        List<TaxRate> appliedTaxRates = new ArrayList<>();
        for (TaxRate taxRate : taxRates) {
            if (taxRate.isBigger(income)) {
                appliedTaxRates.add(taxRate);
                break;
            }
            appliedTaxRates.add(taxRate);
        }
        return appliedTaxRates;
    }
}

enum TaxRate {

    SIX(6, 0, 12_000_000, 0),
    FIFTEEN(15, 12_000_000, 46_000_000, 1_080_000),
    TWENTY_FOUR(24, 46_000_000, 88_000_000, 5_220_000),
    THIRTY_FIVE(35, 88_000_000, 1_500_000_000, 14_900_000),
    THIRTY_EIGHT(38, 1_500_000_000, 300_000_000, 14_900_000),
    FORTY(40, 300_000_000, 500_000_000, 25_400_000),
    FORTY_TWO(42, 500_000_000, 1_000_000_000, 35_400_000),
    FORTY_FIVE(45, 1_000_000_000, Long.MAX_VALUE, 65_400_000); //?
    private final int percent;
    private final long minSalary;
    private final long baseSalary;
    private final long progressiveTax;

    TaxRate(int percent, long minSalary, long baseSalary, long progressiveTax) {
        this.percent = percent;
        this.minSalary = minSalary;
        this.baseSalary = baseSalary;
        this.progressiveTax = progressiveTax;
    }

    public long calc(long income) {
        if (income > baseSalary) {
            long tax = (long) ((baseSalary - minSalary) * (percent / 100.0));
            System.out.printf("%10d * %2d%% = %10d%n", baseSalary - minSalary, percent, tax);
            return tax;
        }
        long remainingIncome = getRemainingIncome(income);
        long tax = (long) (remainingIncome * (percent / 100.0));
        System.out.printf("%10d * %2d%% = %10d%n", remainingIncome, percent, tax);
        return tax;
    }

    public long calcWithProgressiveTax(long income) {
        return (long) (income * (percent / 100.0) - progressiveTax);
    }

    public boolean isBigger(long income) {
        return baseSalary > income;
    }

    private long getRemainingIncome(long income) {
        return income - minSalary;
    }
}
