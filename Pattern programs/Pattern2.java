public class Pattern2 {
    
    /*
    
    Output- 
        *****
        ****
        ***
        **
        *

     */

    public static void main(String[] args) {
        
        int row, column;
        for (row = 5; row>=1; row--)
        {
            for (column = 1; column<=row; column++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}