import java.util.*;
public class MatrixAddition {
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
    static int[][] addiiton(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2){
        if (r1 != r2 || c1 != c2) {
            System.out.println("Error! rows and columns are not matching ");
            return new int[r1][c1];
        }
        int[][] ans = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return ans;
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
        int[][] ans = addiiton(arr1, r1, c1, arr2, r2, c2);
        PrintArray(ans);
    }
}
