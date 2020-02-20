package lv.tsi.javacourses.notepad;

public class Main {

    public static void main(String[] args) {
        for (; ; ) {
            String cmd = Asker.askString("command");
            switch (cmd) {
                case "exit":
                    System.out.println("Good bye");
                    return;
                case "info":
                case "help":
                    showHelp();
                    break;
                default:
                    System.out.println("Wrong command");
            }

        }

    }

    private static void showHelp() {
        System.out.println("Help: ");
    }
}
