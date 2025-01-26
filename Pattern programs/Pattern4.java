public class Pattern4 {
    
    public static void main(String[] args) {
     
        int row, column, i;
        for (row = 1; row<=5; row++)
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
