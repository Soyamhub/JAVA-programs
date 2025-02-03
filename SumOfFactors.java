import java.util.Scanner;

public class SumOfFactors {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num, sum;
        System.out.println("Enter a number: ");
        num = sc.nextInt();

        SumOfFactors ob = new SumOfFactors ();
        sum = ob.sumfact(num);
        System.out.println("Sum of factors = "+ sum);
    }
    int sumfact(int n)
    {
        int i, s=0;
        for (i=1; i<=n; i++)
        {
            if(n%i==0)
                s=s+i;
        }
        return s;
    }
}
