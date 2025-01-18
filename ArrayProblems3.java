
import java.util.Arrays;

public class ArrayProblems3 {
    static int[] FindElement(int[] arr){
        //Used to find the smallest and largest number in an array
        //Sort the array
        Arrays.sort(arr);
        int[] ans = {arr[0],arr[arr.length-1]};
        return ans;
    }

    static int[] FindKthElement(int[] arr, int k){
        //USed to find the kth smallest and largest numer in an array
        Arrays.sort(arr);
        int[] ans= {arr[k-1],arr[arr.length-k]};
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,7,3,5};
        System.out.println(Arrays.toString(FindElement(arr)));
        System.out.println(Arrays.toString(FindKthElement(arr, 2)));
    }
}
