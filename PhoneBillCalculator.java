package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    static  double overageRate = 0.25;
    static double taxRate = 0.15;
   static Scanner scanner = new Scanner(System.in);

   public static double getPlanFee (){
       System.out.println("Enter the plan fee please");
       double planFee = scanner.nextDouble();
       return planFee;
   }
   public static int getoverageMinutes (){
       System.out.println("Enter overage minutes please");
       int overageMinutes = scanner.nextInt();
       return overageMinutes;
   }

   public static void calculations(int overageMinutes,double planFee){
       double overagePrice = overageMinutes * overageRate;
       double totalBefTax = overagePrice + planFee;
       double tax = taxRate * totalBefTax;
       double roundedTax = Math.round(tax*100)/100.0;
       double Total = tax + totalBefTax;
       double roundedTotal = Math.round(Total*100)/100.0;

       System.out.println(planFee);
       System.out.println(overagePrice);
       System.out.println(roundedTax);
       System.out.println(roundedTotal);

   }



    public static void main(String[] args) {
       double planFee = getPlanFee();
       int overageRate = getoverageMinutes();
       calculations(overageRate, planFee);

    }
}
