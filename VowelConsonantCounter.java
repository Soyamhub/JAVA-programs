import java.util.*;
class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i, vowels = 0, consonants = 0; String s;
        System.out.println("Enter a string: ");
        s = sc.nextLine().toUpperCase();
        for (i=0; i< s.length(); i++)
        {
            char ch = s.charAt(i);
        
            if (Character.isLetter(ch))
            {
                if ("AEIOU".indexOf(ch) != -1)
                vowels++;
                else
                consonants++;
            }
        }
        System.out.println("Number of vowels = "+vowels+" and consonants = "+consonants);
    }
}