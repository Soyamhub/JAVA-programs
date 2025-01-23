import java.util.Scanner;

public class RotateArrayNoextraSpace {
    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void rotateInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
    static void reverse(int[] arr, int i, int j){
        while (i < j) {
            SwapinArray(arr, i, j);
            i++;
            j--;
        }
    }
    static void SwapinArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
        int k = sc.nextInt();
        rotateInPlace(arr, k);
        PrintArray(arr);
    }
}
