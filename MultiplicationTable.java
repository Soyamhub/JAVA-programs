import java.util.Scanner;

public class MultiplicationTable {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num, i, rem;
        System.out.print("Enter a number to get its multiplication table: ");
        num = sc.nextInt();
        for(i=1; i<=10; i++)
        {
            rem = num*i;
            System.out.println(num+" * "+i+" = "+rem);
        }
    }
}
