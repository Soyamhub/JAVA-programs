public class TargetSum {
    static int Triplet(int[] arr, int x){
        //Find the total no. of pairs in the array whose sum is equal so the given value x.
        int triplet = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        triplet++;
                    } 
                }
            }   
        }
        return triplet;
    }
    static int Pair(int[] arr, int x){
        //Find the total no. of pairs in the array whose sum is equal so the given value x.
        int pair = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    pair++;
                }
            }   
        }
        return pair;
    }
    public static void main(String[] args) {
        
        int[] arr = {4,6,3,5,8,2};
        int target = 7;
        System.out.println("Pairs are "+ Pair(arr, target));
        System.out.println("Triplets are "+ Triplet(arr, target));
    }
}
