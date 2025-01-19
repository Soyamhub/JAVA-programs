
public class SortedOrNot {
    static void simpleversion(int[] arr){
        int flag = 0;
        outer:
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    System.out.println("Not sorted");
                    flag++;
                    break outer;
                }
            }
        }
        if (flag==0) {
            System.out.println("it is sorted");
        }
    }
    
    static void Optimizedversion(int[] arr){
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("It is sorted");
        }
        else{
            System.out.println("Not sorted");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        simpleversion(arr);
        Optimizedversion(arr);
    }
}
