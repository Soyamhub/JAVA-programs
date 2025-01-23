import java.util.*;

class LongestWord
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, len, h=0; String s, p="", q=""; char ch;
        System.out.println("Enter a sentence: ");
        s = sc.nextLine();
        s = s.trim(); s = s+" ";
        len = s.length();
        for(i=0; i<len; i++)
        {
            ch = s.charAt(i);
            if (ch!=' ')
                p = p+ch;
            else
            {
                if (p.length() > h)
                {
                    h = p.length();
                    q = p;
                }
                p = " ";
            }
        }
        System.out.println("Longest Word = "+q);
    }
}