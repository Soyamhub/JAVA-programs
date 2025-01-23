import java.util.*;

/* A twin prime is a prime number that is either 2 less or 2 more than another prime number */

class TwinPrime {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, a, b, c=0, d=0; 
        System.out.println("Enter 2 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        for (i=1; i<=a; i++)
        {
            if (a%i==0)
                c++;
        }
        for (i=1; i<=b; i++)
        {
            if (b%i==0)
                d++;
        }

        if(c==2 && d==2 && Math.abs(a-b)==2)
            System.out.println(a+" & "+b+" are twin prime numbers.");
        else
            System.out.println(a+" & "+b+" are not twin prime numbers.");
    }
}
