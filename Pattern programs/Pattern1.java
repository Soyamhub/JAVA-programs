public class Pattern1 {
    
    /*
    Output- 
            *
            **
            ***
            ****
            *****
     */

    public static void main(String[] args) {
        
        int row, column;
        for (row = 1; row<=5; row++)
        {
            for (column = 1; column<=row; column++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
