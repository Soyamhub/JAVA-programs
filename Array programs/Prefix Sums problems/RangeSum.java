import java.util.Scanner;

public class RangeSum {
    static void PrintArray(int[] arr, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] prefixsum(int[] arr, int n) {
        int[] prefix = new int[n + 1]; // New array to store prefix sums
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write the number of elements in array ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1]; // Using 1-based indexing

        System.out.println("Enter the values ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        PrintArray(arr, n);

        int[] pref = prefixsum(arr, n);

        System.out.println("Prefix Sum Array:");
        PrintArray(pref, n);

        System.out.println("Write how many queries you want ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Write the value of l and r respectively (1-based index).. ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            if (l < 1 || r > n || l > r) {
                System.out.println("Invalid range. Please enter values between 1 and " + n);
                continue;
            }

            int sum = pref[r] - pref[l - 1];
            System.out.println("Sum: " + sum);
        }
    }
}
