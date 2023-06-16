package phonebook;

import java.util.ArrayList;
import java.util.List;

public class TelephoneDirectory {
    private List<Record> phoneBook;

    public TelephoneDirectory() {
        phoneBook = new ArrayList<>();
    }

    public void add(Record record) {
        phoneBook.add(record);
    }

    public List<Record> find(String name) {
        List<Record> mathcRecords = new ArrayList<>();
        for (Record record : phoneBook) {
            if (record.getName().equals(name)) {
                mathcRecords.add(record);
            }
        }

        return mathcRecords;
    }

    public String getPhoneBookAsString() {
        StringBuilder sb = new StringBuilder();
        for (Record record : phoneBook) {
            sb.append("Name: ").append(record.getName()).append(", Phone: ").append(record.getPhone()).append("\n");
        }
        return sb.toString();
    }
}
