import java.util.*;
class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, dup, rev = 0, rem;
        System.out.println("Enter a number");
        num = sc.nextInt();
        dup = num;
        while (dup>0)
        {
            rem = dup % 10;
            rev = rev * 10 + rem;
            dup = dup / 10;
        }
        if (rev == num)
            System.out.println(num+" is a palindrome number");
        else
        System.out.println(num+" is not a palindrome number");
    }
}
