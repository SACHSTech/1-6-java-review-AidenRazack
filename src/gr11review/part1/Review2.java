package gr11review.part1;
import java.io.*;

/**
* A program that gives the user a list of joke options and prints one out based on their input.
* @author: A. Razack
*
*/

public class Review2 {
    public static void main(String[] args) throws Exception {

        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        // Display menu options
        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");
        System.out.print("Choose a menu option: ");

        int option;

        // Ask user for month and day numbers
        option = Integer.parseInt(key.readLine());

         // Switch case to handle different menu options
         switch (option) {
            case 0:
                System.out.println("Why do bees have sticky hair?");
                System.out.println("They always use honeycombs!");
                break;
            case 1:
                System.out.println("Why don't feet ever make good jokes?");
                System.out.println("Because they always fall flat!");
                break;
            case 2:
                System.out.println(" What’s the biggest problem with snow boots?");
                System.out.println("They melt!");
                break;
            case 3:
                System.out.println("Why did the teacher wear sunglasses?");
                System.out.println("Because their class was too bright!");
                break;
            default:
                System.out.println("Invalid menu option");
                break;
        }
    }
}