import java.util.*;
public class countingOccurrences {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the number ");
        long num = sc.nextLong();
        System.out.println("Give the number you want to check how main occurance it has");
        int check = sc.nextInt();
        int occurance = 0;
        while (num!=0) {
            long rem = num % 10;
            if (check == rem) {
                occurance++;
            }
            num = num / 10;
        }
        System.out.println("The number has "+ occurance +" occurances." );
    }
}
