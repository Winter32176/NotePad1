package lv.tsi.javacourses.notepad;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Asker {
    private static Scanner scan = new Scanner(System.in);


    public static String askString(String msg) {
        System.out.print(msg + ": ");
        return scan.next();
    }


    public static int askInt(String msg) {
        for (;;){
            try {
                System.out.print(msg + ": ");
                int recordToDelete= scan.nextInt();
                return recordToDelete;
            } catch (InputMismatchException wrong_input) {
                String str = scan.next();
                System.out.println(str + " isn't number");

            }
        }



    }
}
