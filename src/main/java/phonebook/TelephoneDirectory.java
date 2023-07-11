package phonebook;

import java.util.ArrayList;
import java.util.List;

public class TelephoneDirectory {
    private final List<RecordPhone> phoneBook;

    public TelephoneDirectory() {
        phoneBook = new ArrayList<>();
    }

    public void add(RecordPhone record) {
        phoneBook.add(record);
    }

    public List<RecordPhone> find(String name) {
        List<RecordPhone> mathcRecords = new ArrayList<>();
        for (RecordPhone record : phoneBook) {
            if (record.getName().equals(name)) {
                mathcRecords.add(record);
            }
        }

        return mathcRecords;
    }
}
