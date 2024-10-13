import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class displayNLine {
public static String displayLines(File file, int lineNumber) throws IOException {
    LinkedList<String> lines = new LinkedList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
            if (lines.size() > lineNumber) {
                lines.removeFirst();
                lines.add(line);
            }
        }
        return lines.toString();
    }
}

}
