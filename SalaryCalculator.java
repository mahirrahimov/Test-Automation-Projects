package chapter3;

/* if statement
all salesperson get $1000 per week.
sales more than 10 get $250 bonus
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        // 1. initialize the known values

        int salary = 1000;
        int bonus = 250;

        // 2. Get unknown values

        System.out.println("Enter number of sales");
        Scanner scanner = new Scanner (System.in);
        int sales = scanner.nextInt();

        // 3. Quick detour

        if ( sales > 10) {
            salary = salary + bonus;
        }

        // 4. Output
        System.out.println("Salary is $" + salary);

    }
}
