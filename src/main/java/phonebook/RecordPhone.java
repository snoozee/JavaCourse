package phonebook;

public class RecordPhone {
    private final String name;
    private final String phone;

    public RecordPhone(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
