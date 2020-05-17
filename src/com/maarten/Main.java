package com.maarten;

import java.util.Scanner;

public class Main {
    //simple mortgage calculator

    public static void main(String[] args) {
        int principal = (int) Console.readNumber("Principal (1K - 1M)? ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual interest (1-30)? ", 1, 30);
        byte years = (byte) Console.readNumber("Number of years (1-30)? ", 1, 30);

        var calculator = new MortgageCalculator(principal, annualInterest, years);

        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }
}
