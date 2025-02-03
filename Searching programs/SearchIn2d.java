import java.util.Scanner;

public class SearchIn2d {
    static void PrintArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
    static boolean search(int[][] arr, int num){
        if(arr.length == 0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //This code is used for searching element in 2d array
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number of rows in array ");
        int rows = sc.nextInt();
        System.out.println("Write the number of columns in array ");
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        System.out.println("Enter the value ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        PrintArray(arr);
        System.out.println("Enter the number you want to find ");
        int num = sc.nextInt();
        System.out.println(search(arr, num));
    }
}
