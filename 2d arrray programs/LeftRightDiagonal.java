import java.util.Scanner;

/* Java program that creates a 3×3 matrix, stores 9 numbers, and displays both the left diagonal and right diagonal elements. */

public class LeftRightDiagonal 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];

        System.out.println("Enter the values for the array: ");
        for (int rows = 0; rows < 3; rows++) 
        {
            for (int cols = 0; cols < 3; cols++) 
            {
                a[rows][cols] = sc.nextInt();
            }
        }

        System.out.println("\nThe 3x3 matrix is:");
        for (int rows = 0; rows < 3; rows++) 
        {
            for (int cols = 0; cols < 3; cols++) 
            {
            System.out.print(a[rows][cols] + " ");
            }
            System.out.println();
        }

        System.out.println("Values of left diagonal: ");
        for (int i = 0; i < 3; i++) 
        {
            System.out.println(a[i][i] + " ");
        }

        System.out.println("\nValues of right diagonal: ");
        for (int i = 0; i < 3; i++) 
        {
            System.out.println(a[i][2 - i] + " ");
        }

        sc.close();
    }
}
