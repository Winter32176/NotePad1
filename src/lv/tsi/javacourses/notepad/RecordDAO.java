package lv.tsi.javacourses.notepad;

import java.io.File;
import java.util.*;

public class RecordDAO {
    private static List<Record> records = new ArrayList<>();
    private static final File FILE = new File("Records");

    public static void deleteAllRecords() {
        records.clear();
    }


    public void add(Record rec) {
        records.add(rec);
    }

    public List<Record> getAllRecords() {
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

//
//    public void load() {
//        try (Scanner in = new Scanner(FILE)) {
//
//            while (in.hasNext()) {
//                int id =  in.nextInt();
//                String name = in.next();
//                String surname = in.next();
//                String phone = in.next();
//                String email = in.next();
//
//
//
//
//               Record.setName(name);
//
//
//
//                records.add(m);
//
//            }
//
//        } catch (IOException e) {
//            System.out.println("Cannot load record list. Creating new");
//        }
//
//    }
//
//    public void save() {
//        try (PrintWriter out = new PrintWriter(FILE)) {
//            for (Record r : records) {
//                out.printf("%d %s %s %s %s %n", r.getId(), r.getName(), r.getSurname(), r.getPhone(), r.getEmail());
//            }
//
//        } catch (IOException e) {
//            System.out.println("ERROR file unattainable");
//        }
//    }

}