import java.util.Scanner;

public class FirstRepeatNumber {
    static int repeatFirst(int[] arr){
        int num = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j] ) {
                    num = arr[i];
                    return num;
                }
            }
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println("Write the number of elements in array ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the value ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The first repeated value is " + repeatFirst(arr));
    }
}
