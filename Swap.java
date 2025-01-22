public class Swap {
    public static void main(String[] args) {
        //Swap the elements without using temporary variables
        int num = 6;
        int num2 = 7;
        System.out.println("Before swap num: "+ num + " num2: " + num2);
        num = num + num2;
        num2 = num - num2;
        num = num - num2;
        System.out.println("After swap num: "+ num + " num2: " + num2);
    }
}
