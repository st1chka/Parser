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

import static Parser.SAX.Format.FOR_MAT;

public class SaxMyParser extends DefaultHandler {
    public static List<String> list = new ArrayList<>();
    public static StringBuilder builder = new StringBuilder();
    public static String FORM;

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

        for (int i = 0; i < args.length ; i++) {

            if (args[i].equals("-s") && args[i+1].startsWith("file")){
                int constant = i+1;
                list.stream()
                        .filter(s -> s.endsWith(args[constant]))
                        .forEach(System.out::println);
            }else if (args[i].equals("-s") && args[i+1].endsWith(".java")){
                list.stream().filter(s->s.endsWith("java")).forEach(System.out::println);
            }
            else if (args[i].equals("-s") && args[i+1].endsWith(".xhtml")){
                list.stream().filter(s->s.endsWith("xhtml")).forEach(System.out::println);
            }else if (args[i].equals("-s") && args[i+1].endsWith(".xml")){
                list.stream().filter(s->s.endsWith("xml")).forEach(System.out::println);
            }

        }
    }



}
