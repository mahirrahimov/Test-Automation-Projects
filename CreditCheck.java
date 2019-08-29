package chapter5;

import chapter3.IfElseQuota;

import java.util.Scanner;

public class CreditCheck {



    public static void main(String[] args) {

        int requiredsalary =25000;
        int requiredscore= 700;

        System.out.println("Enter your salary");

        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();

        System.out.println("Enter you credit score");
        int creditScore = scanner.nextInt();

        if (salary>requiredsalary  && creditScore> requiredscore){
            System.out.println("Congrats! You are qualified for credit");

        }
        else
        {
            System.out.println("Sorry! You are not qualified");


    }
}
}
