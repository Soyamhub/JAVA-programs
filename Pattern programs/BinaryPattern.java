import java.util.*;

class BinaryPattern
{

    public static void main(String[] args) {
        int row, column, size=5;
        for (row=1; row<=size; row++)
        {
            for(column=1; column<=size; column++)
            {
                System.out.print((row+column+1) % 2);
            }
            System.out.println();
        }
    }
}