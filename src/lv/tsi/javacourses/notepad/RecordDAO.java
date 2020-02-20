package lv.tsi.javacourses.notepad;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RecordDAO {
    private static List<Record> records = new ArrayList<>();
    private static final File FILE = new File("Records");


    public void add(Record rec) {
        records.add(rec);
    }

    public List<Record> getAllRecords() {


        return Collections.unmodifiableList(records);
    }

    public static void deleteRecord(int delete) {
        int m = 0;
        for (Record r : records) {
            if (delete == r.getId()) {
                records.remove(m);
                break;
            }
            m++;
        }
    }


    public void load() {
        try (Scanner in = new Scanner(FILE)) {

            while (in.hasNext()) {

            }

        } catch (IOException e) {
            System.out.println("Cannot load record list. Creating new");
        }

    }

    public void save() {
        try (PrintWriter out = new PrintWriter(FILE)) {
            for (Record r : records) {
                out.printf("%s %s %s %s %n", r.getName(), r.getSurname(), r.getPhone(), r.getEmail());
            }

        } catch (IOException e) {
            System.out.println("ERROR file unattainable");
        }
    }

}