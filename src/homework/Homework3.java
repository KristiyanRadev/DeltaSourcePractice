package src.homework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args){

        Scanner myInput = new Scanner(System.in);
        System.out.print("Enter your nickname: ");
        String nickname = myInput.next();

        String password = "1234";
        System.out.print("Enter your password: ");
        String passwordCheck = myInput.next();

        while (!password.equals(passwordCheck)) {
            System.out.println("Wrong password: ");
            passwordCheck = myInput.next();
        }
        System.out.println("Welcome " + nickname + "!");
    }
}






