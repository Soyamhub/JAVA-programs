import java.util.*;
class Factorial
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, fact = 1, i;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        
        for(i=1; i<=num; i++)
        {
            fact*=i;
        }
        System.out.println("The factorial of "+num+" is "+fact);
    }
}