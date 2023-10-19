package javaapplication171;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
import java.lang.*;
import java.util.InputMismatchException;

public class last10 {

    public static void main(String[] args) {

        int count = 0;
        int input = 0;
        int arrSize = 10;

        Object[] numArr = new Object[arrSize];

        while (input >= 0) {

            Scanner s = new Scanner(System.in);
            System.out.println("Enter a number: ");

            try {

                input = s.nextInt();

                if (input < 0) {
                    break;

                }

                count = count % numArr.length;

                numArr[count] = input;
                count++;

            }

            catch (InputMismatchException e) {
                System.out.println(e);
                s.close();
            }

        }

        for (int i = 0; i < numArr.length; i++) {

            if (numArr[count % 10] != null) {

                System.out.print(numArr[count % 10] + " ");

            }

            count++;

        }

    }

}