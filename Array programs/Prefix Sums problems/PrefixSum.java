import java.util.Scanner;

public class PrefixSum {
    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //in this program we made an array where we use prefix sum
        System.out.println("Write the number of elements in array ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the value ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        PrintArray(arr);
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
        PrintArray(arr);
    }
}
