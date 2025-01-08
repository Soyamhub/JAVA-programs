import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the numbers you want to fibonacci series");
        int N = sc.nextInt();
        int Fibo =0;
        int prev1 = 0;
        int prev2 = 1;
        if (N==1) {
            Fibo = 0;
        }
        else if (N==2){
            Fibo = 1;
        }
        else{
            for (int i = 3; i <= N; i++) {
                Fibo = prev1 + prev2;
                prev1 = prev2;
                prev2 = Fibo;
            }
        }
        System.out.println(Fibo);
    }
}
