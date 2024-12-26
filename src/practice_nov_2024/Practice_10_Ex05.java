package practice_nov_2024;

public class Practice_10_Ex05 {
    public static void main(String[] args) {
        int a= 20;
        System.out.println(--a + a++ + a--); //58
        System.out.println(a); //19

        // A = 19,
        // B = 19, a = a+1 = 20
        // c = 20, a = a-1 = 19
        // 19 + 20 + 19 = 58

        System.out.println("***************** Example 2 ******************");
        int i = 20;
        System.out.println(++i + --i + ++i + i++ + i++); //105
        System.out.println(i); // 23
        // A = 21, i = 21
        // B = 20. i = 20
        // c = 21, i =21
        //d = 21, i = i+1 = 22
        // e = 22, i= i+1 = 23
        // 21 + 20 + 21 + 21+ 22 = 105


    }
}
