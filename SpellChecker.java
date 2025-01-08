import java.util.*;
public class SpellChecker {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a word or a character");
        String s = sc.next();
        char c = s.strip().charAt(0);
        
        if (c >= 'a' && c <= 'z') {
            System.out.println("It is a lowercase.");
        }
        else{
            System.out.println("It is a uppercase.");
        }
    }
}
