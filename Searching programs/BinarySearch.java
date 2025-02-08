import java.util.*;

class BinarySearch {
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int i, j, temp, lowerbound, upperbound, middle;

        System.out.println("Enter 5 numbers: ");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4 - i; j++) 
            {
                if (a[j] > a[j + 1]) 
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("Enter the element to search: ");
        int n = sc.nextInt();
        lowerbound = 0;
        upperbound = a.length - 1;

        while (lowerbound <= upperbound) {
            middle = (lowerbound + upperbound) / 2;

            if (n > a[middle]) {
                lowerbound = middle + 1;
            } else if (n < a[middle]) {
                upperbound = middle - 1;
            } else {
                System.out.println("The element is at index: " + middle);
                return;
            }
        }

        System.out.println("Element is not present");
    }
}