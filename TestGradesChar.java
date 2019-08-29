package chapter3;

import java.util.Scanner;

public class TestGradesChar {
    public static void main(String[] args) {
        System.out.println("What is your score?");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        scanner.close();
        String grade;
        if (score < 60) {
            grade = "F";
        } else if (score < 70) {
            grade = "D";
        } else if (score < 80) {
            grade = "C";
        } else if (score < 90) {
            grade = "B";
        } else if(score<=100){
            grade = "A";
        }
        else{grade= "wrong";}
        System.out.println("Your grade is  " + grade);
    }
}