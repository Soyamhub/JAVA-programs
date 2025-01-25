import java.util.*;

class EvenOddSplitting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int ev = 0, od = 0;

        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Enter the number: ");
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0)
                ev++;
            else
                od++;
        }

        int b[] = new int[ev];
        int c[] = new int[od];

        int j = 0, k = 0;
        for (int i = 0; i < 10; i++) 
        {
            if (a[i] % 2 == 0) 
            {
                b[j] = a[i];
                j++;
            } else 
            {
                c[k] = a[i];
                k++;
            }
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < b.length; i++) 
        {
            System.out.println(b[i]);
        }

        System.out.println("Odd numbers:");
        for (int i = 0; i < c.length; i++) 
        {
            System.out.println(c[i]);
        }
    }
}