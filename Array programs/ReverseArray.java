import java.util.*;

public class ReverseArray {

    static int[] Method1(int[] arr) {
        //In this method we use extra array "ans" and for loop
        int[] ans = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    
    static int[] Method2(int[] arr){
        //In this method we use extra array "ans" and while loop
        int[] ans = new int[arr.length];
        int j = 0, i = arr.length-1;
        while (i >= 0) {
            ans[j++] = arr[i--];
        }
        return ans;
    }

    static void SwapinArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int[] arr){
        //In this method we reverse array without using any extra space like "ans"
        int i = 0, j = arr.length-1;
        while (i < j) {
            SwapinArray(arr, i, j);
            i++;
            j--;
        }
    }
    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
        int[] ans = Method1(arr);
        System.out.println("Reverse array is ");
        PrintArray(ans);
        ans = Method2(arr);
        System.out.println("Reverse array is ");
        PrintArray(ans);
        reverseArray(arr);
        System.out.println("Reverse array is ");
        PrintArray(arr);
    }
}
