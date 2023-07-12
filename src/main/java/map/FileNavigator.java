package map;

import java.util.*;

public class FileNavigator {
    private final Map<String, List<FileData>> fileMap;

    public FileNavigator() {
        fileMap = new HashMap<>();
    }

    public void add(FileData fileData) {
        String path = fileData.getPath();
        List<FileData> files = fileMap.getOrDefault(path, new ArrayList<>());

        for (FileData existingFile : files) {
            if (!existingFile.getPath().equals(path)) {
                System.out.println("There is an error because the key path and the file path do not match");
                return;
            }
        }

        files.add(fileData);
        fileMap.put(path, files);
    }

    public List<FileData> find(String path) {
        return fileMap.getOrDefault(path, new ArrayList<>());
    }

    public List<FileData> filterBySize(int maxSize) {
        List<FileData> filteredFiles = new ArrayList<>();
        for (List<FileData> files : fileMap.values()) {
            for (FileData file : files) {
                if (file.getSize() <= maxSize) {
                    filteredFiles.add(file);
                }
            }
        }
        return filteredFiles;
    }

    public void remove(String path) {
        fileMap.remove(path);
    }

    public Set<String> getPaths() {
        return fileMap.keySet();
    }
}

