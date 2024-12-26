package practice_nov_2024;

import java.util.Scanner;

public class Practice_11_Task_1 {
    public static void main(String[] args) {
        //Take a user input - Name, Age and Salary and print them in the end.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name :");
        String name = scanner.next();
        System.out.print("Enter Age :");
        int age = scanner.nextInt();
        System.out.print("Enter Salary :");
        long salary = scanner.nextLong();
        System.out.println("Name of the person is :" + name);
        System.out.println("Name of the person is :" + age);
        System.out.println("Name of the person is :" + salary);
        scanner.close();


    }

}
