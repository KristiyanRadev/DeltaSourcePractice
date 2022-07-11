package src.homework;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double BGN = 1.64549;
        double USD;

        Scanner scanner = new Scanner(System.in);

        USD = scanner.nextDouble();
        double convertedCurrency = BGN * USD;

        convertedCurrency = convertedCurrency * 100;
        convertedCurrency = Math.floor(convertedCurrency) / 100;

        System.out.println(convertedCurrency);

    }
}












