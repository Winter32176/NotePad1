package lv.tsi.javacourses.notepad;

import java.util.List;

public class Main {
    private static RecordDAO records = new RecordDAO();

    public static void main(String[] args) {
        for (; ; ) {
            String cmd = Asker.askString("command");
            switch (cmd) {
                case "exit":
                    System.out.println("Good bye");
                    records.save();
                    return;
                case "info":
                case "help":
                    showHelp();
                    break;
                case "create":
                    createRecord();
                    break;
                case "list":
                    listRecords();
                    break;
                case "delete":
                    deleteFromlist();
                    break;
                default:
                    System.out.println("Wrong command");
            }

        }

    }

    private static void deleteFromlist() {
        var delete = Asker.askInt("Id");
        RecordDAO.deleteRecord();
    }

    private static void listRecords() {
        List<Record> all = records.getAllRecords();
        for (var r : all) {
            System.out.println(r);
        }
    }

    private static void createRecord() {
        var r = new Record();
        r.askInfo();
        records.add(r);

    }

    private static void showHelp() {
        System.out.println("Help: ");
    }

}