package com.maarten;

import java.text.NumberFormat;

public class MortgageReport {
    private MortgageCalculator calculator;
    private NumberFormat currency;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage() {
        System.out.println("Mortgage: " + currency.format(calculator.calculateMortgage()));
        System.out.println("");
    }

    public void printPaymentSchedule() {
        System.out.println("Payment Schedule");
        for (double balance : calculator.getRemainingBalances()) {
            System.out.println(currency.format(balance));
        }
    }
}
