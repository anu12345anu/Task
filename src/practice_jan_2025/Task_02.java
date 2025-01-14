package practice_jan_2025;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        //Count vowels and consonants in a String.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.next().toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else {
                consonantCount++;
            }

        }
        System.out.println("vowel count: "+ vowelCount);
        System.out.println("consonant count: "+ consonantCount);
        sc.close();

    }
}
