public class NumberPattern3 {
    
    /*  
    Output- 
        54321
        5432
        543
        54
        5
    */
    public static void main(String[] args) {
        
        int row, column;
        for (row = 1; row<=5; row++)
        {
            for (column = 5; column>=row; column--)
            {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
