package practice_nov_2024;

public class Practice_06_arthematic_operators {
    public static void main(String[] args) {

        int sum1 = 10;
        int sum2 = 20;

        System.out.println(sum1+sum2); //mathematical operation

        String FN = "Anuradha";
        String LN = "Reddy";
        System.out.println(FN+LN); //Concatenation

        System.out.println(FN+LN+sum1+sum2);
        //if the first operant is string then + will always act as concatenation
        System.out.println(sum1+sum2+FN+LN);
        //if the first operant is not a string(int,float) then + will act as mathematical operation
        System.out.println(sum1+sum2+FN+LN+sum1+sum2+sum1+sum2);




    }
}
