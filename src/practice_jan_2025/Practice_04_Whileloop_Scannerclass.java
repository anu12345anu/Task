package practice_jan_2025;

import java.util.Scanner;

public class Practice_04_Whileloop_Scannerclass {
    public static void main(String[] args) {
        // WAP to print age in reverse order
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        while(age>=1)
        {
            System.out.println("Age is " + age);
            age --;
            sc.close();
        }
    }
}
