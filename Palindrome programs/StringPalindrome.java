import java.util.*;

public class StringPalindrome {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s; int num;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        StringPalindrome ob = new StringPalindrome();
        s = ob.palin(num);
        System.out.println(s);
    }

    String palin (int x)
    {
        int rem, rev=0, dup=x;
        while (x>0)
        {
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x/10;
        }

        if (dup == rev)
            return "The number is a palindrome number";
        else 
            return "The number is NOT a palindrome number";
    }
}
