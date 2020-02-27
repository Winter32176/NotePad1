package lv.tsi.javacourses.notepad;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Asker {
    private static Scanner scan = new Scanner(System.in);


    public static String askString(String msg) {
        System.out.print(msg + ": ");
        String text=scan.next();

        ArrayList<String> text1 = new ArrayList<>();
        if (text.startsWith("'")) {
            for (; ; ) {
                String abc = scan.next();
                text1.add(text);
                text1.add(abc);
                if (abc.endsWith("'")) break;
            }

        }else return text;
        String bigText = String.valueOf(text1);


        return bigText;
    }


    public static int askInt(String msg1, int min, int max) {
        for (; ; ) {
            int result = askInt(msg1);
            if (result < min || result > max) {
                System.out.printf("Value should be in range %d to %d %n", min, max);
            } else {
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


    public static LocalTime askTime(String msg) {
        for (; ; ) {
            try {
                var strTime = askString(msg + "(" + StringDateTime.TIME_PATTERN + ")");
                return StringDateTime.timeFromString(strTime);
            } catch (DateTimeParseException e) {
                System.out.println("Wrong time format." + "(" + StringDateTime.TIME_PATTERN + ")");
            }
        }
    }

    public static LocalDate askDate(String msg) {
        for (; ; ) {
            try {
                var strDate = askString(msg + "(" + StringDateTime.DATE_PATTERN + ")");
                return StringDateTime.dateFromString(strDate);
            } catch (DateTimeParseException e) {
                System.out.println("Wrong date format." + "(" + StringDateTime.DATE_PATTERN + ")");
            }
        }
    }

}
