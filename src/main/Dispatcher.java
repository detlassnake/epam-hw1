package main;

import java.util.Scanner;

public class Dispatcher  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = (int)(Math.random() * 1000);
        int input = 0;
        int count = 0;

        System.out.println("Guess number between 1 and 1000");
        //System.out.println("Answer " + number);
        do {
            input = in.nextInt();
            count++;
            if (input > number) {
                System.out.println("Too high");
            } else if (input == number){
                System.out.println("Yoi win correct number is " + number + ", number of guesses it took to get the correct number is " + count);
            } else {
                System.out.println("Too low");
            }
        } while (number != input);
    }
}