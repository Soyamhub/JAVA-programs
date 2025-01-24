import java.util.*;

class PalindromeWord {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, len; String s, p=""; char ch;
        System.out.print("Enter a word: ");
        s = sc.nextLine();
        s = s.trim();
        len = s.length();
        for (i=0; i<len; i++)
        {
            ch = s.charAt(i);
            p = ch+p;
        }
        System.out.println("The palindrome of "+s+" is "+p);
    }
}
