package practice_nov_2024;

public class Practice_11_Input_argus_Ex01
{
    public static void main(String[] args) {


        //1. Program arguments --
        //Scanner class
        //Buffer Reader
        //int age = 26 ;   // How to make hard coded input dynamic ?
        int age = Integer.parseInt(args[0]);
        // Right click on the class name -->More run/debug -->Modify run configuration
        // --> provide arguments -->Apply-->Ok (Note one arguments or in array format and provide args[] num here)
        System.out.println(age > 25 ? "Allowed to go GOA" : "Not Allowed to go Goa");

    }
}
