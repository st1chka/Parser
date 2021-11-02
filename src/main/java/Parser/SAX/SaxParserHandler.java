package Parser.SAX;


import Parser.Main;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class SaxParserHandler extends DefaultHandler {
    private String currentTagName;

    Root root = new Root();

    public Root getRoot() {
        return root;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currentTagName = qName;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String alpha = new String(ch, start, length);
        if (!alpha.isBlank()) {

            if (alpha.startsWith("dir")) {
                SaxMyParser.builder.append(alpha).append("/");
            }
            if (alpha.startsWith("file")) {
                SaxMyParser.list.add(SaxMyParser.builder.toString() + alpha);
            }
        }


    }


    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        currentTagName = null;
    }


}






