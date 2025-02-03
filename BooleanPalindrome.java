import java.util.*;

class BooleanPalindrome
{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean b; int num;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        BooleanPalindrome ob = new BooleanPalindrome();
        b = ob.palin(num);
        if (b == true)
        System.out.println("The number is a palindrome number.");
        else 
        System.out.println("The number is NOT a palindrome number.");
    }
    boolean palin(int x)
    {
        int rem, rev=0, dup=x;
        while (x>0)
        {
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x/10;
        }

        if (dup == rev)
            return true;
        else 
            return false;
    }
}