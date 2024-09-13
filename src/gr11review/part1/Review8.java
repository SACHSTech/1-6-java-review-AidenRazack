package gr11review.part1;
import java.util.Random;

/**
* A program that simulates a slot machine for 1000 rolls and outputs the amount of triple matches
* @author: A. Razack
*
*/

public class Review8 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int tripleCount = 0;

        for (int i = 0; i < 1000; i++) {
            // Generate three random numbers between 0 and 8
            int num1 = random.nextInt(9);
            int num2 = random.nextInt(9);
            int num3 = random.nextInt(9);
            
            // Output the result of the pull
            System.out.println(num1 + " " + num2 + " " + num3);
            
            // Check if all three numbers are the same
            if (num1 == num2 && num1 == num3) {
                tripleCount++;
            }
        }
        
        // Output the total count of triples
        System.out.println(tripleCount);
    }
}