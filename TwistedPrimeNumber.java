import java.util.Scanner;

/* A Twisted Prime Number is a number that is prime, and its reverse is also a prime number. */

public class TwistedPrimeNumber 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i, num, rev = 0, count = 0, d = 0, rem;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        for (i = 1; i <= num; i++)
        {
            if (num % i == 0)
            count++;
        }
        int dup = num;
        while (num > 0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        for (i = 1; i <= rev; i++)
        {
            if (rev % i == 0)
            d++;
        }
        if (count == 2 && d == 2)
            System.out.println(dup + " is a twisted prime number.");
        else
            System.out.println(dup + " is NOT a twisted prime number.");
    }
}