public class Pyramid {
    
/*
    Output-
        1
    121
    12321
    1234321
    123454321
 */
public static void main(String[] args) {
    
        int row, column, i;
        for (row=1; row<=5; row++)
        {
            for (i=1; i<=5-row; i++)
            {
                System.out.print(" ");
            }
            for (column=1; column<=row; column++)
            {
                System.out.print(column);
            }
            for (column=row-1; column>=1; column--)
            {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
