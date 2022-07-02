
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FileWordSearch {
    public static void main(String[] args) {
        try {
            File war_and_peace = new File("Толстой Лев Николаевич. Война и мир. Том 1 - TheLib.Ru.txt");
            FileReader fileReader = new FileReader(war_and_peace);
            BufferedReader br = new BufferedReader(fileReader);

            int counter = 0;
            Pattern pattern = Pattern.compile("страдани(ем|е|я|ю|и)", Pattern.CASE_INSENSITIVE);
            String currentLine = "";

            while((currentLine = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(currentLine);
                while (matcher.find()) {
                    System.out.println("found " + matcher.group(0) + " in " + currentLine);
                    counter ++;
                }
            }
            br.close();
            System.out.println(counter);

        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }
}