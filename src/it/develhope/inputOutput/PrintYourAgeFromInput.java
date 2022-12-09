package it.develhope.inputOutput;

import java.util.Scanner;

public class PrintYourAgeFromInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.printf("Your age is: %d", age);

        input.close();
    }



}
