package gr11review.part1;
import java.io.*;

/**
* A program that asks the user for a sentence and then outputs the number of characters, space, letter "a"s, and odd characters
* in the sentence.
* @author: A. Razack
*
*/

public class Review7 {
    public static void main(String[] args) throws Exception {

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        // Prompt the user to enter a sentence
        String Sentence;
        Sentence = keyboard.readLine();

        // Count the number of characters in the sentence
        int numCharacters = Sentence.length();

        // Count the number of spaces in the sentence
        int numSpaces = 0;
        for (int i = 0; i < Sentence.length(); i++) {
            if (Sentence.charAt(i) == ' ') {
                numSpaces++;
            }
        }

        // Count the number of occurrences of the letter 'a' in the sentence
        int numA = 0;
        for (int i = 0; i < Sentence.length(); i++) {
            if (Sentence.charAt(i) == 'a') {
                numA++;
            }
        }

        // Create a string from the odd-numbered characters in the sentence
        StringBuilder oddChars = new StringBuilder();
        for (int i = 0; i < Sentence.length(); i++) {
            if (i % 2 == 0) {
                oddChars.append(Sentence.charAt(i));
            }
        }
        

        // Output the results
        System.out.println("There are " + numCharacters + " characters in the sentence.");
        System.out.println("There are " + numSpaces + " spaces in the sentence.");
        System.out.println("There are " + numA + " letter a in the sentence.");
        for (int i = 0; i < oddChars.length(); i++) {
            System.out.print("-");
        }
    }
}