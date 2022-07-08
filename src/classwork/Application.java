package classwork;

import java.util.Scanner;
public class Application {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int racer1 = sc.nextInt();
        int racer2 = sc.nextInt();
        int racer3 = sc.nextInt();
        while((racer1 < 0 || racer1 > 50) || (racer2 < 0 || racer2 > 50) || (racer3 < 0 || racer3 > 50))
        {
            System.out.println("One or more of the racers has time more than 50");
            System.out.println("Enter seconds again");
            racer1 = sc.nextInt();
            racer2 = sc.nextInt();
            racer3 = sc.nextInt();

        }
        int sum = racer1 + racer2 + racer3;
        int minutes = sum / 60;
        int seconds = sum % 60;
        String str = String.format("%d:%02d" , minutes, seconds);
        System.out.println(str);
    }
}
