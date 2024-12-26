package practice_nov_2024;

import java.sql.SQLOutput;

public class Practice_09_ternary_operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // Write a program to find the maximum between three values using ternary operators
        //String max_num = (a > b && a > c) ? "a is max number" : (b > a && b > c) ? "b is max number" : "c";
        int max_num = (a >= b && a >= c) ? a : (b >= c) ? b : c;

        // if c > a && c > b then c is highest
        System.out.println("Max number is " +max_num);
        //System.out.printf("Max number is %d",max_num );  // since the return type is int using %d
        


    }
}
