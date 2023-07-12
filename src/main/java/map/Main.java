package map;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();

        FileData fileData1 = new FileData("files.txt", 1024, "/main/resources/map");
        fileNavigator.add(fileData1);

        FileData fileData2 = new FileData("firstApp.java", 2048, "/main/resources/map");
        fileNavigator.add(fileData2);

        FileData fileData3 = new FileData("image.jpg", 4096, "/another/path");
        fileNavigator.add(fileData3);

        String searchPath = "/main/resources/map";
        List<FileData> foundFiles = fileNavigator.find(searchPath);

        System.out.println("Files found for path: " + searchPath);
        for (FileData file : foundFiles) {
            System.out.println(file.getName() + " (" + file.getSize() + " bytes)");
        }

        int maxSize = 3000;
        List<FileData> filteredFiles = fileNavigator.filterBySize(maxSize);

        System.out.println("\nFiles filtered by size (<= " + maxSize + " bytes):");
        for (FileData file : filteredFiles) {
            System.out.println(file.getName() + " (" + file.getSize() + " bytes)");
        }

        String removePath = "/main/resources/map";
        fileNavigator.remove(removePath);

        System.out.println("\nFiles after removing path: " + removePath);
        for (String path : fileNavigator.getPaths()) {
            List<FileData> files = fileNavigator.find(path);
            for (FileData file : files) {
                System.out.println(file.getName() + " (" + file.getSize() + " bytes)");
            }
        }
    }
}
