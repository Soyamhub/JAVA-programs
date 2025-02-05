import java.util.*; 

public class FibonacciMatrix 
{

    public static void main(String args[]) 
    {
        int matrix[][] = new int[3][7];
        
        int a = 0, b = 1;
        for (int rows = 0; rows < 3; rows++) {
            for (int cols = 0; cols < 7; cols++) {
                matrix[rows][cols] = a;
                int next = a + b;
                a = b;
                b = next;
            }
        }
        
        for (int rows = 0; rows < 3; rows++) {
            for (int cols = 0; cols < 7; cols++) {
                System.out.print(matrix[rows][cols] + "\t");
            }
            System.out.println();
        }
    }
}
