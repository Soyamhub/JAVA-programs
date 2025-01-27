public class NumberPattern2 {
    
    /*  
    Output- 
        12345
        1234
        123
        12
        1 
    */
    public static void main(String[] args) {
        
        int row, column;
        for (row = 5; row>=1; row--)
        {
            for (column = 1; column<=row; column++)
            {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}