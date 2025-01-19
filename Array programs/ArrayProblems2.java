public class ArrayProblems2 {
    static int NumOfOccurences(int[] arr, int x){
        //Used to find how many occurences a number has in an array
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }

    static int LastOccurence(int[] arr, int x){
        //Used to find the last occurences a number has in an array
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = i;
            }
        }
        return index;
    }

    static int GreaterThan(int[] arr, int x){
        //Used to find how many numbers in an array is greater than the number x
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,2,5};
        int x = 2;
        System.out.println("The num of occurence " + x +" has in array is "+ NumOfOccurences(arr, x));
        System.out.println("The last occurence " + x +" has in array is index "+ LastOccurence(arr, x));
        System.out.println("There are "+ GreaterThan(arr, x) + " elements greater than " + x);
    }
}
