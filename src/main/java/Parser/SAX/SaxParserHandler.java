package Parser.SAX;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class SaxParserHandler extends DefaultHandler {
    private static boolean isFound;
    private String currentTagName;
    private String element;

    private boolean isChild = false;
    private boolean isChildren = false;
    private boolean isName = false;

    Root root = new Root();
    Root search = new Root();

    public Root getRoot() {
        return root;
    }




    @Override
    public void endDocument() throws SAXException {

    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currentTagName = qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        currentTagName = null;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {


        if (!new String(ch, start, length).isBlank()) {
            String cs = new String(ch, start, length).trim();
            System.out.println(cs);

        }
    }
}






