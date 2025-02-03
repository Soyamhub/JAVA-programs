import java.util.Scanner;

public class MatrixMultiplication {
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
    static void Multiply(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2){
        if (c1 != r2) {
            System.out.println("Error! The column of first array is not equal to the row of the second array");
            return; 
        }

        int[][] ans = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    ans[i][j] += (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        PrintArray(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number of rows for array 1 ");
        int r1 = sc.nextInt();
        System.out.println("Write the number of columns for array 1 ");
        int c1 = sc.nextInt();
        int[][] arr1 = Getinput(r1,c1);

        System.out.println("Write the number of rows for array 2 ");
        int r2 = sc.nextInt();
        System.out.println("Write the number of columns for array 2 ");
        int c2 = sc.nextInt();
        int[][] arr2 = Getinput(r2, c2);

        System.out.println("After multiplication");
        Multiply(arr1, r1, c1, arr2, r2, c2);
    }
}
