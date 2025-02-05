import java.util.Scanner;

public class Rotate {
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
    static void Reverse(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number of rows for array ");
        int r = sc.nextInt();
        System.out.println("Write the number of columns for array ");
        int c = sc.nextInt();
        int[][] arr = Getinput(r,c);
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("After transpose:");
        PrintArray(arr);
        for (int i = 0; i < arr.length; i++) {
            Reverse(arr[i]);
        }
        System.out.println("After rotating:");
        PrintArray(arr);
    }
}
