

public class ArrayProblems1 {
    public static void main(String[] args) {
        int[] arr = {5,3,20,9,3};
        MaxValue(arr);
        SearchElement(arr, 20);
        
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
    static void SearchElement(int[] arr, int x){
        //Search the given number in the array(Binary search) and return the index
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                index = i;
                break;
            }
        }
        if(index == 0){
            System.out.println("Not found.");
        }
        else{
            System.out.println("The value is found at "+ index);
        }
    }
}
