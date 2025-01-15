import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a 3-digit number
        System.out.println("Enter the 3-digit number for checking if it is an Armstrong number: ");
        int num = sc.nextInt(); // Read the input number

        // Call the armstrong method to calculate the sum of cubes of its digits
        int sum = armstrong(num);

        // Check if the calculated sum is equal to the original number
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    // Method to calculate the sum of the cubes of the digits of a number
    static int armstrong(int num) {
        int digit, sum = 0; // Initialize variables

        // Loop to extract each digit, cube it, and add to the sum
        while (num != 0) {
            digit = num % 10; // Extract the last digit
            sum = sum + (digit * digit * digit); // Add the cube of the digit to the sum
            num = num / 10; // Remove the last digit from the number
        }

        // Return the calculated sum
        return sum;
    }
}
