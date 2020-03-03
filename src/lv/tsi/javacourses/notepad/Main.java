package lv.tsi.javacourses.notepad;

import lv.tsi.javacourses.notepad.records.*;
import lv.tsi.javacourses.notepad.records.note.Alarm;
import lv.tsi.javacourses.notepad.records.Book;
import lv.tsi.javacourses.notepad.records.note.Note;
import lv.tsi.javacourses.notepad.records.note.Reminder;
import lv.tsi.javacourses.notepad.records.vehicle.Fuel;
import lv.tsi.javacourses.notepad.records.vehicle.TypeOfEngine;
import lv.tsi.javacourses.notepad.records.vehicle.Vehicle;

public class Main {
    private static RecordDAO records = new RecordDAO();

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
                case "create":
                case "cr":
                    createRecord();
                    break;
                case "list":
                    listRecords();
                    break;
                case "delete":
                case "del":
                case "remove":
                case "rm":
                    deleteRecord();
                    break;
                case "DelAll":
                    deleteAll();
                    break;
                case "search":
                case "sh":
                    searchRecords();
                    break;
                case "expired":
                    showExpired();
                    break;

                default:
                    System.out.println("Wrong command");
            }

        }

    }

    private static void showExpired() {
        for (var r : records.getAllRecords()) {
            if (r instanceof Expirable && ((Expirable) r).isExpirred()) {
                System.out.println(r);
            }

        }
    }

    private static void searchRecords() {
        var substr = Asker.askString("Enter substring to find");
        for (var r : records.getAllRecords()) {
            if (r.contains1(substr)) {
                System.out.println(r);
            }
        }

    }


    private static void deleteAll() {

        var confirm = Asker.askString("Delete all?");
        if (confirm.equalsIgnoreCase("yes")) RecordDAO.deleteAllRecords();

    }

    private static void deleteRecord() {
        RecordDAO.listEmpty();
        var delete = Asker.askInt("Id");
        RecordDAO.deleteRecord(delete);
    }


    private static void listRecords() {
        var all = records.getAllRecords();
        RecordDAO.listEmpty();
        for (var r : all) {
            System.out.println(r);
        }
    }


    private static void addRecord(AbstractRecord r) {
        r.askInfo();
        records.add(r);
        System.out.println("Created: " + r);
    }

    private static void createRecord() {

        var type = Asker.askString("Record type");
        switch (type) {
            case "person":
            case "pr":
            case "Pr":
            case "Person":
                addRecord(new Person());
                break;

            case "Book":
            case "book":
            case "bk":
            case "Bk":
                addRecord(new Book());
                break;

            case "Note":
            case "note":
                addRecord(new Note());
                break;

            case "Alarm":
            case "alarm":
                addRecord(new Alarm());
                break;

            case "Reminder":
            case "reminder":
                addRecord(new Reminder());
                break;

            case "Vehicle":
            case "vehicle":
                addRecord(new Vehicle());
                break;

            case "Type":
                addRecord(new TypeOfEngine());
                break;

            case "fuel":
                addRecord(new Fuel());
                break;

            default:
                System.out.println("Wrong record type");
        }

    }

    private static void showHelp() {
        System.out.println("Help: ");
    }

}
