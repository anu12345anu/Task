package practice_jan_2025;

import java.util.Scanner;

public class Practice_05_dowhileloop {
            public static void main(String[] args) {
            // WAP to print age in reverse order
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();

            do  // Program execute at least once, do doesn't have condition
            {
                System.out.println("Age is " + age);
                age--;
            }
            while (age <= 1);
                sc.close();
        }
}
