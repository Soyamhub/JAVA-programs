import java.util.*;
public class SearchInString {
    static boolean search(String str, char target){
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //Just a normal program to find if the character present in the string or not
        Scanner sc = new Scanner(System.in);
        String str = "soyam";
        System.out.println("Enter the char you want to search");
        char ch = sc.next().charAt(0);
        System.out.println(search(str, ch));
    }
}
