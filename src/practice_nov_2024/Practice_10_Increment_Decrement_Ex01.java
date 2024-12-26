package practice_nov_2024;

public class Practice_10_Increment_Decrement_Ex01 {
    public static void main(String[] args) {
        int a = 20;
        int b = ++a; // Prefix - increment first and then assign
        int c = a++; //Postfix - assign first and then increment
        // line number | input exp value | result value
        // 6 | ++a --> a=a+1 = 21 increment first and then assign to b | b = 21 and now 'a' value is 21
        // 7 | c = 21, assign a value first to c and then increment 21+1 = 22, now 'a' value became 22

        // a - 22, b - 21, c - 21


        System.out.println("Value of a is "+ a );
        System.out.println("Value of b is "+ b );
        System.out.println("Value of c is "+ c );
    }
}
