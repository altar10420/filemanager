public class Main {

    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        fileManager.listFilesInDirectory("/");
        fileManager.sortFilesInDirectory("/");
    }
}
