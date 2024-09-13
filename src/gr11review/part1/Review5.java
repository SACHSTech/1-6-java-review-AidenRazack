package gr11review.part1;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
* A program that asks for the user to input a yearly invested amount, a compound interest rate, and a target amount and outputs the 
* number of years it will take to reach the target amount
* @author: A. Razack
*
*/

public class Review5 {
    public static void main(String[] args) throws Exception {

        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        // Prompt the user for inputs
        System.out.print("Enter the yearly invested amount: ");
        double yearlyAmount;
        yearlyAmount = Double.parseDouble(key.readLine());

        System.out.print("Enter the compound interest rate: ");
        double compoundInterestRate;
        compoundInterestRate = Double.parseDouble(key.readLine());

        System.out.print("Enter the target amount: ");
        double targetAmount;
        targetAmount = Double.parseDouble(key.readLine());

        double totalAmount = 0;
        int years = 0;

        // Loop to calculate the total amount after each year with compound interest
        while (totalAmount < targetAmount) {
            totalAmount += yearlyAmount;
            totalAmount += (compoundInterestRate / 100) * totalAmount;
            years++;
        }

        System.out.println("The target amount will be earned in " + years + " years.");
    }
}
