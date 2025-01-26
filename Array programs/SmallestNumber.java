import java.util.Scanner;

class SmallestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ar[] = new int[5];
        int i, first_element, second_element;

        System.out.println("Enter 5 numbers: ");
        for (i = 0; i < 5; i++) {
            ar[i] = sc.nextInt();
        }

        first_element = second_element = Integer.MAX_VALUE;

        for (i = 0; i < ar.length; i++) {
            if (ar[i] < first_element) {
                second_element = first_element;
                first_element = ar[i];
            } else if (ar[i] < second_element && ar[i] != first_element) {
                second_element = ar[i];
            }
        }

        if (second_element == Integer.MAX_VALUE) {
            System.out.println("No second smallest element.");
        } else {
            System.out.println("The smallest element is " + first_element +" and the second smallest element is " + second_element + ".");
        }
    }
}