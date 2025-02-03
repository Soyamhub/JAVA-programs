import java.util.*;
class CharPalindrome
{
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        char ch; int num;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        CharPalindrome ob = new CharPalindrome();
        ch = ob.palin(num);
        if(ch=='y')
            System.out.println("The number is a palindrome number.");
        else
            System.out.println("The number is NOT a palindrome number.");
    }
    char palin (int x)
    {
        int rem, rev = 0, dup=x;
        while (x>0)
        {
            rem = x%10;
            rev = rev*10+rem;
            x = x/10;
        }
        if (rev == dup)
            return 'y';
        else
            return 'n';
    }
}