package practice_jan_2025;

import java.util.Scanner;

public class Task_03_Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("This number is not a Prime number");
                return;
            }
        }
        System.out.println("The number is a Prime number");
    }
}
