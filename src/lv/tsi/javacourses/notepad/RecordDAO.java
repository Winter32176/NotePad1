package lv.tsi.javacourses.notepad;

import lv.tsi.javacourses.notepad.records.AbstractRecord;

import java.io.File;
import java.util.*;

public class RecordDAO {
    private static List<AbstractRecord> records = new ArrayList<>();
    private static final File FILE = new File("Records");

    public static void deleteAllRecords() {
        records.clear();
    }


    public void add(AbstractRecord rec) {
        records.add(rec);
    }

    public List<AbstractRecord> getAllRecords() {
        return Collections.unmodifiableList(records);
    }

    public static void deleteRecord(int delete) {
//        option 1
//        for (int k = 0; k <records.size(); k++) {
//            Record r = records.get(k);
//            if (r.getId()== delete){
//                records.remove(k);
//                break;
//            }
//
//        }
//
//        option 2
        records.removeIf(r -> r.getId() == delete);
//
//        option 3
//        Iterator<Record> i = records.iterator();
//        while (i.hasNext()) {
//            Record r = i.next();
//            if (r.getId() == delete) {
//                i.remove();
//                break;
//            }
//        }

// если пусто сообщить и после удаления сообщить

    }

    public static void listEmpty() {
        if (records.size() == 0) {
            System.out.println("List is empty");
        }

    }




//          option 0
//    public static void deleteRecord(int delete) {
//        int indexNum = 0;
//        for (Record r : records) {
//            if (delete == r.getId()) {
//                records.remove(indexNum);
//                break;
//            }
//            indexNum++;
//        }
//    }



}