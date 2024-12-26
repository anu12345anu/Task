package practice_nov_2024;

public class Practice_07_relational_operators {
    public static void main(String[] args) {
        //used to compare values
        //<(Lessthan) , <=(Lessthan or equals to) , > (Greaterthan) , >= (Greaterthan or equals to)
        // ==  (equals to), != (not equals to)

        int a = 10;
        int b = 20;
        int c = 30;
        int num1 = 50;
        int num2 = 50;
        boolean result = num1 == num2 ;

        System.out.println(result); // True
        System.out.println((a < b) & (a < c)); //True and True - True
        System.out.println((a > b) & (b > c)); // False and False - False
        System.out.println((a < b) & (b < c)); // True and True - True
        System.out.println((a < b) & (b > c)); // True and False - False
        System.out.println((a < b) || (c == b)); // True and False - True
        System.out.println((a != b) & (a > b)); // True and False - False
        System.out.println(!(a < b)); //True and True - True will change to False due to using !-not
        System.out.println(!!(a < b)); //True and True - True -->False -->True
        System.out.println(num1<num2); // False

        System.out.println("-------- Example 2 ---------");
        int x = 12;
        int y = -1;
        System.out.println(y+1); // -1 +1 = 0

        System.out.println("-------- Example 3 (Compound operator)---------");
        int ab = 15;
        int cd = -1;
        cd = cd+1; // oneway of writing
        cd += 1;   // cd = cd+1, other way of writing, in java we will right this way
        System.out.println(cd);

        System.out.println("-------- Example 4---------");
        int xyz = 12;
        boolean final_result = !(xyz>10||xyz>5); //True||True - ! -->False
        System.out.println(final_result);





    }
}
