package practice_jan_2025;

import java.util.Scanner;

public class Task_05_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.next().toLowerCase();
        String reverse = "";
        for (int i = word.length() - 1; i >=0; i--) {
            // ex:level, length 5 -1 =4, 4>= 0, 4-1 = 3
            // ex 2 - radar
            reverse += word.charAt(i);
            System.out.println(reverse);
        }
        if (word.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}