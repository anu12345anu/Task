package practice_nov_2024;

import java.util.Scanner;

public class Practice_12_Task02_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Division");
        System.out.println("5. Modu1s");
        System.out.println("6. Squareroot");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = "+ (num1 + num2));
                break;
            case 2:
                System.out.println("Result = "+ (num1 - num2));
                break;
            case 3:
                System.out.println("Result = "+ (num1 * num2));
                break;

            case 4:
                System.out.println("Result = "+ (num1 / num2));
                break;

            case 5:
                System.out.println("Result = "+ (num1 | num2));
                break;

            default:
                System.out.println("Invalid choice");
                }
    }
}
