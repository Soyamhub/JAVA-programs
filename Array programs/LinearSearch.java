import java.util.Scanner;

public class LinearSearch {
    
    static int linear(int a[], int n, int x)
    {
        for (int i=0; i<n; i++)
        {
            if (a[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter 5 numbers: ");
        for (int i=0; i<5; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the number to be searched for: ");
        int x = sc.nextInt();
        int n = a.length;
        int index = linear(a, n, x);

        if (index == -1)
            System.out.println("Element is not present in the array.");
        else 
            System.out.println("Element found at position "+ index);

    }
}
