package phonebook;

import java.util.Arrays;
import java.util.List;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        TelephoneDirectory phoneDirectory = new TelephoneDirectory();

        String[][] contacts = {
                {"John Doe", "1234567890"},
                {"Jane Smith", "0992221133"},
                {"John Smith", "0993331122"},
                {"Jane Doe", "0994442233"},
                {"Sam Lake", "0995553344"},
                {"John Doe", "0996665544"},
                {"John Wake", "0671112233"},
                {"James Doe", "0982223344"},
                {"John Jameson", "0674447788"},
                {"Dik Doe", "0959998877"},
                {"John Advocaat", "0999996655"},
                {"John Doe", "0565554433"},
                {"Lane Wane", "0434327444"},
                {"Sam Fisher", "0998877654"},
                {"John Simonsson", "0681234567"},
        };

        for (String[] contact : contacts) {
            Record record = new Record(contact[0], contact[1]);
            phoneDirectory.add(record);
        }

        String searchName = "John Doe";
        List<Record> matchingRecords = (phoneDirectory.find(searchName));

        if (!matchingRecords.isEmpty()) {
            System.out.println("Records found for name: " + searchName);
            for (Record record : matchingRecords) {
                System.out.println("Name: " + record.getName());
                System.out.println("Phone: " + record.getPhone());
                System.out.println("-------------------------");
            }
        } else {
            System.out.println("No records found for the name: " + searchName);
        }
    }
}
