package Parser.SAX;


import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Parser.Constants.Constants.FILE;
import static Parser.Constants.Constants.SEARCH;

public class SaxMyParser extends DefaultHandler {
    public static List<String> list = new ArrayList<>();
    public static StringBuilder builder = new StringBuilder();


    public Root parse(String filePath) {

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SaxParserHandler handler = new SaxParserHandler();

        try {
            SAXParser parser = factory.newSAXParser();
            File file = new File(filePath);
            parser.parse(file, handler);

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        return handler.getRoot();
    }

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
