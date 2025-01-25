import java.util.Scanner;

public class SortOddandEven {
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

    static void sort(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] % 2 == 1 && arr[j] % 2 == 0) {
                swap(arr, i, j);
                i++;
                j--;
            }
            if (arr[i] % 2 == 0) {
                i++;
            }
            if (arr[j] % 2 == 1) {
                j--;
            }
        }
    }

    public static void main(String[] args) {
        // In this program we sort the array consisting of odd and even numbers and we
        // have to sort them where all the even integers are in beginning followed by
        // all the odd integers.
        // Here the realtive order of odd and even integers doesn't matter
        System.out.println("Write the number of elements in array ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the value ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        PrintArray(arr);
        sort(arr);
        System.out.println("Sorted array ");
        PrintArray(arr);
    }
}
