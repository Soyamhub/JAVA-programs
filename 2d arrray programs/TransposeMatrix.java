import java.util.*;

class TransposeMatrix
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        int row, column; 
        int original[][] = new int [3][3];
        int transpose[][] = new int [3][3];
        System.out.println("Enter 9 numbers: ");

        for(row = 0; row<3; row++)
        {
            for(column = 0; column<3; column++)
            {
                original[row][column] = sc.nextInt();
                transpose[column][row] = original[row][column];
            }
        }
        System.out.println("Printing Matrix without transpose:");
        for(row = 0; row<3; row++)
        {
            for(column = 0; column<3; column++)
            {
                System.out.print(original[row][column]+" ");
            }
        System.out.println();
        }
        System.out.println("Printing Matrix After Transpose:");
        for(row = 0; row<3; row++)
        {
            for(column = 0; column<3; column++)
            {
                System.out.print(transpose[row][column]+" ");
            }
        System.out.println();
        }
    }
}