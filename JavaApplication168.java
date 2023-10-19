package javaapplication168;

import java.time.temporal.ValueRange;
import java.util.*;

public class JavaApplication168 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double n;
        double dealertally = 0;
        double handstally = 0;
        double playertally = 0;

        while (true) {
            System.out.println("Player, pick a number: ");
            n = s.nextDouble();
            int i = 10;
            if (n == 21) {
                handstally++;
                playertally++;
                break;
            } else if ((Math.abs(21 - i)) > (Math.abs(21 - n))) {
                handstally++;
                playertally++;
                System.out.println("Player has " + (Math.abs(21 - n)) + " Player wins.");
            } else if ((Math.abs(21 - n)) > (Math.abs(21 - i))) {
                handstally++;
                dealertally++;
                System.out.println("Dealer has " + (Math.abs(21 - i)) + " Dealer wins.");
            } else if ((Math.abs(21 - n)) == (Math.abs(21 - i))) {
                handstally++;
                System.out.println("Dealer and player tie.");
            }
        }
        System.out.println("Number of hands played: " + handstally);
        System.out.println("\nDealer won: " + dealertally + " Player won: " + playertally);
        System.out.println("\nYou're " + playertally + " for " + handstally);
        System.out.println("\nCome back to the Baar Fork soon.");
    }
}
