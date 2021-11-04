package Parser.SAX;

import org.xml.sax.helpers.DefaultHandler;

import static Parser.Constants.Constants.*;

public class SaxParserHandler extends DefaultHandler {
    Root root;

    public Root getRoot() {
        return root;
    }

    @Override
    public void characters(char[] ch, int start, int length)  {
        String alpha = new String(ch, start, length);
        if (!alpha.isBlank()) {

            if (alpha.startsWith(DIR)) {
                SaxMyParser.builder.append(alpha).append(SPLIT);
            }
            if (alpha.startsWith(FILE)) {
                SaxMyParser.list.add(SaxMyParser.builder.toString() + alpha);
            }
        }
    }

}
