import java.util.*;

/* Displaying how many words are there in the string */
class WordCount{
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s; int i, c=0, len; char ch;

        System.out.println("Enter a string: ");
        s = sc.nextLine();
        s = s.trim().toUpperCase();
        len = s.length();

        for (i=0; i < len; i++)
        {
            ch = s.charAt(i);
            if(ch==' ')
            c++;
        }
        
        System.out.println("Number of words in the string is: "+(c+1));
    }
}