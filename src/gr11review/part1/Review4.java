package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

/**
* A program that asks the user how many itms they want to buy, asks for the prices of the items, and calculates the cost of
* the subtotal, tax, and final total of the items.
* @author: A. Razack
*
*/

public class Review4 {
    public static void main(String[] args) throws Exception {

        DecimalFormat currencyFormat = new DecimalFormat("0.00");
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        // Ask the user how many items they want to buy
        System.out.print("How many items do you want to buy? ");
        int itemCount;
        itemCount = Integer.parseInt(key.readLine());

        double subtotal = 0.0;

        // Loop to get the prices for each item
        for (int i = 1; i <= itemCount; i++) {
            System.out.print("Enter the price for item " + i + ": ");
            double price = Double.parseDouble(key.readLine());
            subtotal += price;
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