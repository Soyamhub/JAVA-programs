import java.util.Scanner;

public class Transpose {
    static void PrintArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    static int[][] Getinput(int row, int column){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[row][column];
        System.out.println("Enter the value ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    static int[][] transposeWithNewSpace(int[][] arr, int row, int column){
        int[][] ans = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }
    static void swap(int i, int j){
        int temp = i;
        i = j;
        j = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number of rows for array ");
        int r = sc.nextInt();
        System.out.println("Write the number of columns for array ");
        int c = sc.nextInt();
        int[][] arr = Getinput(r,c);
        System.out.println("Traspose matrix using extra space:");
        int[][] ans = transposeWithNewSpace(arr, r, c);
        PrintArray(ans);
        System.out.println("Transpose using not extra space");
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        PrintArray(arr);
    }
}
