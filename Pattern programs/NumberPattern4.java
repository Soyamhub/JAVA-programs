public class NumberPattern4 {

/*
    Output-
    12345
    23456
    34567
    45678
    56789
 */
    public static void main(String[] args) {
     
        int row, column;
        for (row=1; row<=5; row++)
        {
            for(column=0; column<5; column++)
            {
                System.out.print(row+column);
            }
            System.out.println();
        }
    }
}
