package practice_nov_2024;

public class Practice_12_If_Else_Conditions {
    public static void main(String[] args) {
        int age = 30;
        if (age > 25)
        {
            System.out.println("Allowed to GOA");
        }

        System.out.println("******************* Example 2 ********************");

        int age1 = 30;
        if (age1 > 25)
        {
            System.out.println("Allowed to GOA");
        }
        else{
            System.out.println("Not Allowed to GOA");
        }

        System.out.println("******************* Example 3 ********************");
        // Note: the else is tied up with immediate if condition.

        int age2 = 21;  //(int age2 = 21;Allowed to Maldives")(int age2 = 31; both if will get executed)
        if (age2 > 25)
        {
            System.out.println("Allowed to GOA");
        }
        if (age2 > 20)
        {
            System.out.println("Allowed to Maldives");
        }
        else{
            System.out.println("You are too young. Stay at home");
        }
    }
}
