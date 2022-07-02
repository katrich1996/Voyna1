import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        File file = new File("Толстой Лев Николаевич. Война и мир. Том 1 - TheLib.Ru.txt");
        Parser parser = new Parser();
        ArrayList<String> lines = parser.parse(file);

        for (String line : lines) {
            System.out.println(line);


        }
    }
}