import java.util.*;

class CommonElement {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    
        int i, j;
        int arr1[] = new int[10];
        int arr2[] = new int[10];

        System.out.println("Enter elements for 1st array: ");
        for (i=0; i<10; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements for 2nd array: ");
        for (j=0; j<10; j++){
            arr2[j] = sc.nextInt();
        }

        System.out.println("Array1: "+ Arrays.toString(arr1));
        System.out.println("Array2: "+ Arrays.toString(arr2));

        for (i=0; i<arr1.length; i++)
        {
            for (j=0; j<arr2.length; j++)
            {
                if (arr1[i] == (arr2[j]))
                    System.out.println("Common element is: "+ (arr1[i]));
            }
        }
    }
}
