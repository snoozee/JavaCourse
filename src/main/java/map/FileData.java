package map;

public class FileData {
    private final String name;
    private final String path;

    public FileData(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }
}

