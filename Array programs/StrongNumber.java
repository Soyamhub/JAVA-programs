import java.util.*;

class StrongNumber {

    /* A strong number is a positive integer where the sum of the factorials of its digits is equal to the number itself. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, dup, r, fact, sum, i;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        dup = num;
        sum = 0;

        while (num>0)
        {
            r = num % 10;
            num = num / 10;
            fact = 1;

            for (i=1; i<=r; i++)
            {
                fact = fact*i;
            }
            sum = sum + fact;
        }

        if (sum == dup)
            System.out.println(dup + " is a strong number.");
        else 
            System.out.println(dup + " is not a strong number.");
    }
}
