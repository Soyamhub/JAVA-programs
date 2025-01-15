

public class RemoveDuplicateFromSorted {
    public static void main(String[] main){
        int[] num = {0, 0, 1, 1, 2, 2, 2};
        int k = 1; // At least one unique element exists in a non-empty array

        for (int i = 1; i < num.length; i++) {
            if (num[i] != num[k - 1]) {
                num[k] = num[i]; // Place the unique element at position k
                k++;
            }
        }

        System.out.println("Number of unique elements: " + k);


        for (int i = 0; i < k; i++) {
            System.out.print(num[i] + " ");
        }
    }
}

