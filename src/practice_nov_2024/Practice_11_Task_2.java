package practice_nov_2024;

import java.util.Scanner;

public class Practice_11_Task_2 {
    public static void main(String[] args) {
        //Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value : " );
        int a = scanner.nextInt();
        System.out.print("Enter b value : " );
        int b = scanner.nextInt();
        String max_num = ((a > b) ? "a is greater then b" : "b is greater than a");
        System.out.println(max_num);
        scanner.close();


    }
}
