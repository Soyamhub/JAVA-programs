import java.util.Scanner;

/* This program checks if a user-provided 3-digit number is an Armstrong number. */

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 digit number for checking is it armstrong or not ");
        int num = sc.nextInt();
        int sum = armstrong(num);
        if (sum == num) {
            System.out.println(num + " is an armstrong number");
        }
        else{
            System.out.println("It is not an armstrong number");
        }
    }

    static int armstrong(int num){
        int digit,sum = 0;
        while(num!=0) {
            digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }
        return sum;
    }
}
