import java.util.*;

class IntPalindrome{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, r;
        System.out.println("Enter a number");
        int num = sc.nextInt();
        IntPalindrome ob = new IntPalindrome();
        r = ob.palin(num);
        if (r==num)
            System.out.println("The number: "+num+" is a palindrome number");
        else
            System.out.println("The number: "+num+" is NOT a palindrome number");
    }
    int palin(int x)
    {
        int rev = 0, rem;
        while (x>0)
        {
            rem = x%10;
            rev = rev*10+rem;
            x = x/10;
        }
        return rev;
    }
}
    