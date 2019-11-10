package main;

import java.util.Scanner;

public class Dispatcher  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int guessNumber = (int)(Math.random() * 1000);
        int input = 0;
        int guessCount = 0;

        System.out.println("Guess number between 1 and 1000");
        //System.out.println("Answer " + guessNumber);   //cheat
        do {
            while (!in.hasNextInt()) {
                System.out.println("error");
                in.next();
            }
            input = in.nextInt();
            guessCount++;
            if (input > guessNumber) {
                System.out.println("Too high");
            } else if (input == guessNumber){
                System.out.println("You win, correct number is " + guessNumber + ", number of guesses it took to get the correct number is " + guessCount);
            } else {
                System.out.println("Too low");
            }
        } while (guessNumber != input);
    }
}