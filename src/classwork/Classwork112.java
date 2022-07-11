package src.classwork;

import java.util.Scanner;


public class Classwork112 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        String result = (number>20)?(number<30)? "Bob": "Paul": "Michel";
        System.out.println(result);

    }
}