package org.example;

import java.util.Scanner;
    public class Main {
        public static void main(String[] args)
        {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Total Loan Amount(Million Toman):");
         int total = scanner.nextInt();
            System.out.print("Loan Repayment Period(year):");
            int period = scanner.nextInt();
            System.out.print("Annual Interest Rate:");
            int interest = scanner.nextInt();
            int paymentNumber = period * 12;
            float monthlyInterestRate = (float) interest / (float) (12*100);
            float x = (float)Math.pow((1+monthlyInterestRate),paymentNumber);
            float payment = total * (monthlyInterestRate * x)/(x -1);
            float TotalInterest = (paymentNumber * payment) - total;

            System.out.println("Each Payment:" + payment +" Million Toman");
            System.out.println("Total Interest:" + TotalInterest + " Million Toman");

        }
}
