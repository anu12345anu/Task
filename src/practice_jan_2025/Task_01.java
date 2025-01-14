package practice_jan_2025;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        //Reverse the number using for loop. (In - 12345, Out - 54321)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int reverseNumber = 0;

        for (int i = number; i > 0; i /= 10) {
            // i= 12345; 12345>0; 12345/10 =5
            int digit = i % 10;  //remainder = 5
            reverseNumber = reverseNumber * 10 + digit;
            // reverseNumber = 0 * 10 + 5 = 5

        }
        System.out.println("Reverse number: " + reverseNumber);
        sc.close();



    }
}
