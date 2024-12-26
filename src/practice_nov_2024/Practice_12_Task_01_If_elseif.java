package practice_nov_2024;

import java.util.Scanner;

public class Practice_12_Task_01_If_elseif {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //No of leaves allowed per year – 28

        int num_leaves_allowed_per_year = 28;
        // for ex if user provide 5 used leaves (28-5=23), so 23>10 pending leaves then it will go to else condition

        System.out.println("Enter number of leaves applied :");
        int num_leaves_applied = scanner.nextInt();

        int pend_leaves = num_leaves_allowed_per_year - num_leaves_applied;


        if (pend_leaves < 0)
        {
            System.out.println("You over used the available leaves");
        }
        else if (pend_leaves == 0)
        {
            System.out.println("No action , you can’t move leaves");
        }
        else if(pend_leaves <= 10)
        {
            System.out.println("No carry forward , you have to avail them");
        }
        else   // > 10
        {
            System.out.println("Carry forward to next year");
        }
    }
}