package practice_jan_2025_functions;
import java.util.Scanner;

public class Task_01_functions {
    // 3 - user input
    //4 - user input
    public static int sum(int a, int b)
    {
        return a+b;
    }
    public static int sub(int a,int b)
    {
        return a-b;
    }
    public static int mul(int a, int b)
    {
        return a*b;
    }
    public static int div(int a, int b)
    {
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();
        // Calling function
        int sum_Result = sum(a,b);
        System.out.println("Sum of a and b is "+sum_Result);
        int sub_Result = sub(a, b);
        System.out.println("Subtraction of a and b is "+sub_Result);
        int mul_Result = mul(a, b);
        System.out.println("Multiplication of a and b is "+mul_Result);
        int div_Result = div(a, b);
        System.out.println("Division of a and b is "+div_Result);
        sc.close();




    }
}
