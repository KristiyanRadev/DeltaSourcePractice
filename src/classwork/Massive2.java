package classwork;

public class Massive2 {
    public static void main(String[]args) {
        int[] intArray = {13,2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = Integer.MIN_VALUE;
        double sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
            {
                max = intArray[i];
            }

        }
        double avg = sum / intArray.length;
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " +avg);
        System.out.println("Max is: " + max);
    }
}
