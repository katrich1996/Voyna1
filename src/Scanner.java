import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Scanner {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("Толстой Лев Николаевич. Война и мир. Том 1 - TheLib.Ru.txt");
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> suffering = new ArrayList<>();
        java.util.Scanner scanner = new java.util.Scanner(fileReader);
        String sufferString = "";
        while (scanner.hasNext()) {
            if (scanner.hasNext("страдани(ем|е|я|ю|и)")) {
                suffering.add(sufferString);
                System.out.println(suffering);
            } else {
                String word = scanner.next();
                arrayList.add(word);

            }
        }
    }

}
