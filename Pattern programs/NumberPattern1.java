public class NumberPattern1 {

    /*
    Output- 
        1
        12
        123
        1234
        12345
     */
    public static void main(String[] args) {
        
        int row, column;
        for (row = 1; row<=5; row++)
        {
            for (column = 1; column<=row; column++)
            {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}