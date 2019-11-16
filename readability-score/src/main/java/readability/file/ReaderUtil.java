package readability.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;


public class ReaderUtil {
    private ReaderUtil() {
    }

    public static String readFile(final String fileName) throws IOException {
        return Arrays.toString(Files.readAllBytes(Paths.get(fileName)));
    }
}
