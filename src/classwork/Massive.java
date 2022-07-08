package classwork;

public class Massive {
    public static void main(String[]args){

        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i<= intArray.length; i++) {
        sum += 1;

        }
          int avg = sum/ intArray.length;
          System.out.println("Sum is: " + sum);
          System.out.println("Average is: " + avg);

    }

}

