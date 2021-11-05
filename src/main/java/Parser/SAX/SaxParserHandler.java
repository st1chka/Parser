package Parser.SAX;

import org.xml.sax.helpers.DefaultHandler;

import static Parser.Constants.Constants.*;
import static Parser.SAX.DataTransferFilter.builder;
import static Parser.SAX.DataTransferFilter.list;

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
                builder.append(alpha).append(SPLIT);
            }
            if (alpha.startsWith(FILE)) {
                list.add(builder.toString() + alpha);
            }
        }
    }

}
