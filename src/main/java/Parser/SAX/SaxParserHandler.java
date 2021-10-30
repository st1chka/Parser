package Parser.SAX;

import Parser.Rot;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.File;

import static Parser.Tags.Tag.TAG_NAME;


public class SaxParserHandler extends DefaultHandler {
    private String currentTagName;

    Rot rot = new Rot();

    public Rot getRot() {
        return rot;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currentTagName = qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        currentTagName = qName;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        if (currentTagName == null) {
            return;
        }

        if (!new String(ch, start, length).isBlank()) {
            System.out.println(new String(ch, start, length));
        }
//        if(new String(ch, start, length).equals(TAG_NAME)){
//            System.out.println(new String(ch, start, length));
//        }

    }
}
