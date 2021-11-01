package Parser.SAX;


import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;


public class SaxMyParser extends DefaultHandler {
//    public Root parse(String filePath) {
//
//
//        SAXParserFactory factory = SAXParserFactory.newInstance();
//        SaxParserHandler handler = new SaxParserHandler();
//
//
//        try {
//            SAXParser parser = factory.newSAXParser();
//            File file = new File(filePath);
//            parser.parse(file,handler);
//        } catch (ParserConfigurationException | SAXException | IOException e) {
//            e.printStackTrace();
//        }
//        return handler.getRoot();
//    }

    public Root parse(String filePath) {


        SAXParserFactory factory = SAXParserFactory.newInstance();
        SaxParserHandler handler = new SaxParserHandler();


        try {
            SAXParser parser = factory.newSAXParser();
            File file = new File(filePath);
            System.out.println(parser.getSchema());
            parser.parse(file, handler);
//            parser.parse(searchString, handler);

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        return handler.getRoot();
    }


}
