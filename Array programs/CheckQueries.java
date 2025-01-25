import java.util.*;

public class CheckQueries {
    static int[] MakeFrequencyArray(int[] arr) {
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;
    }

    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // In this code there is given Q queries, check if the given number is present
        // in the array or not. Note:- Value of all the elements in the array is less
        // than 10 to rhe power 5.
        System.out.println("Write the number of elements in array ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the value ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        PrintArray(arr);
        int[] freq = MakeFrequencyArray(arr);
        System.out.println("Write how many queries you want to ask ");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.println("Enter the query");
            int x = sc.nextInt();
            if (freq[x] > 0) {
                System.out.println("It is present.");
            } else {
                System.out.println("It is not present.");
            }
            q--;
        }
    }
}
