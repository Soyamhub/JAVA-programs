import java.util.Scanner;

/* A number which is either divisible by 7 or ends with the digit 7 is known as Buzz Number. */

public class BuzzNumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        if (num % 7 == 0 ||  num % 10 == 7)
        {
            System.out.println("The number "+num+" is a buzz number");
        }
        else 
        System.out.println("The number "+num+" is NOT a buzz number");
    }
}
