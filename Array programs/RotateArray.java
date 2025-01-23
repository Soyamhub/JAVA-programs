import java.util.Scanner;

public class RotateArray {
    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] rotate(int[] arr, int k){
        //In this method we rotate the array by k steps, where k is non-negative
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n-k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n-k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Write the number of elements in array ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the value ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        PrintArray(arr);
        System.out.println("Write the number of time you want to rotate ");
        int k =sc.nextInt();
        System.out.println("Rotate array is ");
        int[] ans = rotate(arr, k);
        PrintArray(ans);
    }
}
