import java.util.Scanner;

/* To check whether two numbers are Co-Prime (have no common factors other than 1). */

public class CoPrime {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        // If GCD is 1, then the numbers are co-prime
        if (gcd(num1, num2) == 1) 
            System.out.println(num1 + " and " + num2 + " are Co-Prime."); 
        else
            System.out.println(num1 + " and " + num2 + " are NOT Co-Prime.");
    }
}
