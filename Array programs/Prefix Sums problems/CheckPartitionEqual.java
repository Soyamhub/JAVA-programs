import java.util.Scanner;

public class CheckPartitionEqual {
    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int findArraySum(int[] arr){
        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum += arr[i];
        }
        return totalsum;
    }
    static boolean partition(int[] arr){
        int totalsum = findArraySum(arr);
        int prefsum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefsum += arr[i];

            int suffixSum = totalsum - prefsum;
            if (suffixSum == prefsum) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //The provided Java code is designed to check if an array can be partitioned into two subarrays such that the sum of elements in both subarrays is equal
        System.out.println("Write the number of elements in array ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the value ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        PrintArray(arr);
        System.out.println("Equal partition possible: " + partition(arr));
    }
}
