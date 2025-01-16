
import java.lang.reflect.Array;

public class ArrayProblems1 {
    public static void main(String[] args) {
        int[] arr = {5,3,20,9,3};
        MaxValue(arr);
        
        
    }
    static void MaxValue(int[] arr){
        //Maximum Value in array
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.println("The max value is "+ max);
        
    }
}
