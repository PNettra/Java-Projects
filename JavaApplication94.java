package javaapplication94;
import java.util.*;
public class JavaApplication94 {
    public static void printit(int ArrayTwo[][]) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ArrayTwo[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        int[][] ArrayTwo = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(ArrayTwo[i][j] + " ");
            }
            System.out.println();


        }

        int choice;
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to Treasure Hunt!");


        while (true) {

            System.out.println("Enter 0 to exit.");
            System.out.println("Enter the number you think contains the treasure: ");

            choice = s.nextInt();

            if (choice == 4) {
                System.out.println("You have found the treasure!");
                break;
            }
            else if (choice == 0) {
                break;
            }
            else {
                System.out.println("Try again.");
            }

        }

    }

}
