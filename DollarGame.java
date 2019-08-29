package chapter3;

import java.util.Scanner;

public class DollarGame {
    public static void main(String[] args) {

        int requiredAmount = 100;
        int amount;
        System.out.println("How many penny do you have");
        Scanner scanner = new Scanner(System.in);
        int penny = scanner.nextInt();
        System.out.println("How many nickle do you have?");
        int nickle = scanner.nextInt();
        System.out.println("How many dime do you have?");
        int dime = scanner.nextInt();
        System.out.println("How many quarter do you have?");
        int quarter = scanner.nextInt();

        amount = 1 * penny + 5 * nickle + 10 * dime + 25 * quarter;

        if (amount > requiredAmount) {
            int extramount = amount - requiredAmount;
            System.out.println("You put " + extramount + " more cents");
        } else if (requiredAmount > amount) {
            int lessamount = requiredAmount - amount;
            System.out.println("You need " + lessamount + " more cents");

        } else {
            System.out.println("You win the game");
        }
    }
}