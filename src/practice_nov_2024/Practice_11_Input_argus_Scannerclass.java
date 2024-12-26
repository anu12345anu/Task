package practice_nov_2024;

import java.util.Scanner;

public class Practice_11_Input_argus_Scannerclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // system.in means providing input from Console
        System.out.println("Enter age");
        int age = scanner.nextInt();
        System.out.println(age > 25 ? "Allowed to go GOA" : "Not Allowed to go Goa");
        scanner.close();

// we can use Scanner class in below datatypes except char
        //float salary = scanner.nextFloat();
        //long salary = scanner.nextLong();
        //String age = scanner.next();
        // Note - we can't do 'char' for Scanner class


    }
}
