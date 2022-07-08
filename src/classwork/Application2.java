package classwork;

import java.util.Scanner;

public class Application2 {
    public static  void main(String[]args){
        Scanner myName = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = myName.nextLine();
        for (int i = 0; i < name.length(); i++){
            System.out.print(name.charAt(i));
        }

    }
}
