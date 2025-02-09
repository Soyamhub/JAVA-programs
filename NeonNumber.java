import java.util.*;

/* A Neon Number is a number where the sum of the digits of its square is equal to the original number. */

class NeonNumber
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int originalNum, sum=0;
        System.out.print("Enter a number: ");
        originalNum = sc.nextInt();
        int square = originalNum * originalNum;
        
        while(square>0)
        {
            sum+= square % 10;
            square /= 10;
        }

        if(sum == originalNum)
        {
            System.out.println("The number "+originalNum+" is a neon number.");
        }
        else
        {
            System.out.println("The number "+originalNum+" is NOT a neon number.");
        }

    }
}