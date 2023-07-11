package phonebook;

import java.util.List;

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
            RecordPhone recordPhone = new RecordPhone(contact[0], contact[1]);
            phoneDirectory.add(recordPhone);
        }

        String searchName = "John Doe";
        List<RecordPhone> matchingRecords = (phoneDirectory.find(searchName));

        if (!matchingRecords.isEmpty()) {
            System.out.println("Records found for name: " + searchName);
            for (RecordPhone recordPhone : matchingRecords) {
                System.out.println("Name: " + recordPhone.getName());
                System.out.println("Phone: " + recordPhone.getPhone());
                System.out.println("-------------------------");
            }
        } else {
            System.out.println("No records found for the name: " + searchName);
        }
    }
}
