import java.lang.*;
import java.util.Scanner;
public class SquareArray {
    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int[] sort(int[] arr){
        int i = 0, j = arr.length-1;
        int[] ans = new int[arr.length];
        int k = arr.length-1;
        while (i <= j) { 
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                ans[k--] = arr[i] * arr[i];
                i++;
            } else if (Math.abs(arr[i]) < Math.abs(arr[j])) {
                ans[k--] = arr[j] * arr[j];
                j--;
            } else { 
                ans[k--] = arr[i] * arr[i];
                i++;
                j--;
            }
        }    
        return ans;
    }
    public static void main(String[] args) {
        // In this code we have a sort array and we have to return array of square of
        // all those numbers which is also in sort manner
        System.out.println("Write the number of elements in array ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the value ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        PrintArray(arr);
        int[] ans = sort(arr);
        System.out.println("The squared array is ");
        PrintArray(ans);
    }
}
