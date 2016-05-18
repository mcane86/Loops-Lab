package com.michaelcane;

import java.util.Random;
import java.util.Scanner;

public class Loops {

    public String oneToTen() {
        String output = "*** Output ***\n";
        for (int i = 1; i <= 10; i++) {
            output += i + "\n";
        }
        return output;
    }

    public String oddNumbers() {
        String output = "*** Output ***\n";
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                output += i + "\n";
            }
        }
        return output;
    }

    public String squares() {
        String output = "*** Output ***\n";
        for (int i = 1; i <= 100; i++) {
            int square = (int) Math.sqrt(i);
            if ((square * square) == i) {
                output += i + "\n";
            }
        }
        return output;
    }

    public String random4() {
        String output = "*** Output ***\n";
        for (int i = 1; i < 5; i++) {
            Random r = new Random();
            int randomInt = r.nextInt(10) + 1;
            output += randomInt + "\n";
        }
        return output;
    }

    public String even(int x) {
        String output = "*** Output ***\n";
        for (int i = 1; i < x; i++) {
            if (i % 2 == 0) {
                output += i + "\n";
            }
        }
        return output;
    }

    public String powers(int x) {
        String output = "*** Output ***\n";
        for (int i = 1; i <= x; i++) {
            output += ((int) Math.pow(2, i)) + "\n";
        }
        return output;
    }

    public static Scanner input = new Scanner(System.in);

    public static String takeInput() {
        return input.nextLine();
    }

    public static void children() {
        System.out.println("Are we there yet?");
    }

    public void areWeThereYet() {
        while (!takeInput().equals("Yes")) {
            children();
            takeInput();
        }
    }

    public String pyriamids() {
        String output = "*** Output ***";
        for (int i = 1; i <= 5; i++) {
            output += "\n";
            for (int j = 0; j < i; j++) {
                output += "*";
            }
        }
        return output;
    }

    public String tableSquare() {
        String output = "*** Output ***\n";
        for (int i = 1; i < 5; i++) {
            output += "| " + (1 * i) + " | " + (2 * i) + " | " + (3 * i) + " | " + (4 * i) + " |\n";
        }
        return output;
    }

    public String tableSquares(int value) {
        String output = "*** Output ***\n";
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= value; j++) {
                output += "| " + (i * j) + " ";
            }
            output += "|\n";
        }
        return output;
    }

}