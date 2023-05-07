import java.io.File;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;

public class FileManager {

    public void listFilesInDirectory(String directory) {
        Stream.of(Objects.requireNonNull(new File(directory).listFiles()))
                // for each file check if not a directory .filter(file -> !file.isDirectory())
                .filter(File::isFile) //method reference
                .map(File::getName)
                .forEach(System.out::println);
    }

    public void sortFilesInDirectory(String directory) {
        Stream.of(Objects.requireNonNull(new File(directory).listFiles()))
                .filter(File::isFile)
                .sorted(Comparator.comparingLong(File::length))
                .forEach(file -> {
                    System.out.println(file.getName());
                    System.out.println(file.length());
                    System.out.println();
                });
    }
}
