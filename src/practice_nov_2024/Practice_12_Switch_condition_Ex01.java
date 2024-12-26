package practice_nov_2024;

import java.util.Scanner;

public class Practice_12_Switch_condition_Ex01 {
    public static void main(String[] args) {
        //switch condition
        // Java swith expression must be of byte,short,int,long,enums and string
        //WAP to identify days on the basis of numbers given
        // Monday --- 1
        // Tuesday to sunday -- 2- 7
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int num_of_days = sc.nextInt();
        //switch (num_of_days >1)  --- This is not allowed in switch condition, boolean is not allowed here
        switch (num_of_days) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid number, Not a week day"); // To cover edge case
                break;

        }
    }
}
