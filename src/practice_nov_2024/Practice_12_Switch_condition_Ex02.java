package practice_nov_2024;

import java.util.Scanner;

public class Practice_12_Switch_condition_Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product code");
        int Item_code = sc.nextInt();

        switch (Item_code)
        {
        case 001,002,003 :
            System.out.println("This is an Electronic gadget");
            break;

        case 004,005,006 :
                System.out.println("This is an Mechanical gadget");
                break;

            default:
                System.out.println("Not an Electronic or Mechanical gadget"); // To cover edge case
                break;

        }


    }
}
