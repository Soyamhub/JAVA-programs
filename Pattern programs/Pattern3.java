public class Pattern3 {
    
    /*
    
    Output- 
        *****
         ****
          ***
           **
            *

     */

    public static void main(String[] args) {
        
        int row, column, i;
        for (row = 5; row>=1; row--)
        {
            for (i = 1; i<=5-row; i++)
            {
                System.out.print(" ");
            }
            for (column = 1; column<=row; column++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
