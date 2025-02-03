import java.util.*;
public class SearchInRange {
    static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int search(int[] arr, int num, int start, int end){
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
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
        System.out.println("The number you want to find ");
        int num = sc.nextInt();
        System.out.println("Start point ");
        int start = sc.nextInt();
        System.out.println("End point ");
        int end = sc.nextInt();
        System.out.println("The index of the number in array is "+ search(arr, num, start, end));
    }
}
