package practice_nov_2024;

public class Practice_12_If_elseif_else {
    public static void main(String[] args) {
     int age = 61;

     if (age < 5)
     {
         System.out.println("Train ticket is not needed");
     }
     else if(age >= 5 && age <= 60)
        {
            System.out.println("Train ticket is needed");
        }
     else if(age > 60 && age <= 80)
     {
         System.out.println("Senior citizen discount applied");
     }
     else
         System.out.println("Free");
    }
}
