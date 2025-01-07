
import java.util.Scanner;


public class LargestNumber {
    public static void main(String[] args) {
        //We have to find the largest number from the user inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the 3 numbers you want to compare");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1>n2) {
            if (n1>n3) {
                System.out.println(n1 + " is largest.");
            }
            else{
                System.out.println(n3 + " is largest.");
            }
        }
        else{
            if(n2>n3) {
                System.out.println(n2 + " is largest.");
            }
            else{
                System.out.println(n3 + " is largest.");
            }
        }
    }
}
