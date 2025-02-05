import java.util.Scanner;

public class PascalTraingle {
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
    static int[][] Paskal(int n){
        int[][] ans = new int[n][];
        for (int i = 0; i < n; i++) {
            //Every ith row has (i+1) columns
            ans[i] = new int[i+1];
            //In every row first and last element is 1
            ans[i][0] = ans[i][i] = 1;
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            } 
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number of Paskal's Tree need:");
        int n = sc.nextInt();
        int[][] ans = Paskal(n);
        System.out.println("The paskal's tree is:");
        PrintArray(ans);
    }
}
