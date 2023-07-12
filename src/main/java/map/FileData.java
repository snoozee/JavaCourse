package map;

public class FileData {
    private final String name;
    private final String path;
    private final int size;

    public FileData(String name, int size, String path) {
        this.name = name;
        this.path = path;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public int getSize() {
        return size;
    }
}

