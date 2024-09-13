package gr11review.part1;

/**
* A program that prints odd numbers from 20 to 100 and numbers from 29 to 2.
* @author: A. Razack
*
*/

public class Review3 {
    public static void main(String[] args) throws Exception {

         // Print odd numbers from 20 to 100
         System.out.println("Odd numbers from 20 to 100:");
         for (int i = 20; i <= 100; i++) {
             if (i % 2 != 0) {
                 System.out.println(i);
             }
         }
 
         // Print a blank line between the loops
         System.out.println();
 
         // Print numbers from 29 to 2 in decreasing order
         System.out.println("Numbers from 29 to 2 in decreasing order:");
         for (int i = 29; i >= 2; i--) {
             System.out.println(i);
         }
     }
}
    