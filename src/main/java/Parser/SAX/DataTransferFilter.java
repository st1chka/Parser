package Parser.SAX;

import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

import static Parser.Constants.Constants.*;
public class DataTransferFilter {
    public static List<String> list = new ArrayList<>();
    public static StringBuilder builder = new StringBuilder();

    public static void dataTransferFilter(String[] args) {
        if (args.length < 3) {
            list.forEach(System.out::println);
        }

        for (int i = 0; i < args.length; i++) {

            if (args[i].equals(SEARCH) && args[i + 1].startsWith(FILE)) {
                int constant = i + 1;
                list.stream()
                        .filter(s -> s.endsWith(args[constant]))
                        .forEach(System.out::println);
            } else if (args[i].equals(SEARCH) && args[i + 1].startsWith("*.")) {

                StringBuilder extension = new StringBuilder();
                extension.append(args[i + 1]).delete(0, 2);
                String extensionStr = extension.toString();

                list.stream().filter(s -> s.endsWith(extensionStr)).forEach(System.out::println);
            }
        }
    }

}
