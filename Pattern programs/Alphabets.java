import java.util.*;

class Alphabets
{

/*
Output- 
    A
    AB
    ABC
    ABCD
    ABCDE
 */

    public static void main(String[] args) {
        
        char row, column;
        for (row='A'; row<='E'; row++)
        {
            for (column='A'; column<=row; column++)
            {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}