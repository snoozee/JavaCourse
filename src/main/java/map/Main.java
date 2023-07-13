package map;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();

        FileData fileData1 = new FileData("files.txt", "/main/resources/map");
        fileNavigator.add(fileData1);

        FileData fileData2 = new FileData("firstApp.java", "/main/resources/map");
        fileNavigator.add(fileData2);

        FileData fileData3 = new FileData("image.jpg", "/another/path");
        fileNavigator.add(fileData3);

        String searchPath = "/main/resources/map";
        List<FileData> foundFiles = fileNavigator.find(searchPath);

        System.out.println("Files found for path: " + searchPath);
        for (FileData file : foundFiles) {
            System.out.println(file.getName());
        }

        String removePath = "/main/resources/map";
        fileNavigator.remove(removePath);

        System.out.println("\nFiles after removing path: " + removePath);
        for (String path : fileNavigator.getPaths()) {
            List<FileData> files = fileNavigator.find(path);
            for (FileData file : files) {
                System.out.println(file.getName());
            }
        }
    }
}
