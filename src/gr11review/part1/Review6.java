package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

/**
* A program that asks the user for the prices of the items until they imput 0, and calculates the cost of
* the subtotal, tax, and final total of the items.
* @author: A. Razack
*
*/

public class Review6 {
    public static void main(String[] args) throws Exception {

        DecimalFormat currencyFormat = new DecimalFormat("0.00");
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        boolean endofitems = false;
        double subtotal = 0.0;

        // Loop to get the prices for each item
        while (!endofitems) {
            System.out.print("Enter the price for an item: ");
            double price = Double.parseDouble(key.readLine());
            subtotal += price;
            if (price == 0) {
                endofitems = true;
            }
        }

        // Calculate the tax and grand total
        double tax = subtotal * 0.13;
        double Total = subtotal + tax;

        // Output the costs
        System.out.println("Subtotal: $" + currencyFormat.format(subtotal));
        System.out.println("Tax: $" + currencyFormat.format(tax));
        System.out.println("Total: $" + currencyFormat.format(Total));
    }
}