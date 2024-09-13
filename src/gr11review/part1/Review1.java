package gr11review.part1;
import java.io.*;

/**
* A program that asks a user for a month and day then prints the day of the year.
* @author: A. Razack
*
*/

public class Review1 {
    public static void main(String[] args) throws Exception {

        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        // Setting an array for the days in each month of the year
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int month;
        int day;

        // Ask user for month and day numbers
        System.out.println("Enter the month number: ");
		month = Integer.parseInt(key.readLine());

        System.out.println("Ender the day number");
		day = Integer.parseInt(key.readLine());

        // Test to see if the month and day inputs are within acceptable parameters
        if (month < 1 || month > 12 || day < 1 || day > daysInMonth[month - 1]) {
            System.out.println("Invalid date. Please enter a valid month and day.");
            return;
        }

        // Calculate the day of the year
        int dayOfYear = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }
        dayOfYear += day;

        System.out.println(dayOfYear);
    }
}