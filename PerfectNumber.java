import java.util.*;

class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i, sum = 0;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        
        for (i=1; i<=num/2; i++)
        {
            if (num%i==0)
            sum+=i;
        }
        if (sum == num)
            System.out.println(num+" is a perfect number.");
        else
            System.out.println(num+" is not a perfect number.");
    }
}