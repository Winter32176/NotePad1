package lv.tsi.javacourses.notepad;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Asker {
    private static Scanner scan = new Scanner(System.in);


    public static String askString(String msg) {
        System.out.print(msg + ": ");
        return scan.next();
    }


    public static int askInt(String msg1, int min, int max) {
        for (; ; ) {
            int result = askInt(msg1);
            if (result < min || result > max) {
                System.out.printf("Value should be in range %d to %d %n", min, max);
            }else {
                return result;
            }
        }
    }

    public static int askInt(String msg1) {
        for (; ; ) {
            try {
                System.out.print(msg1 + ": ");
                int integer = scan.nextInt();
                return integer;
            } catch (InputMismatchException wrong_input) {
                String str = scan.next();
                System.out.println(str + " isn't number");

            }
        }


    }
}
