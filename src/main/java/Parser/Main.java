package Parser;

import Parser.SAX.Root;
import Parser.SAX.SaxMyParser;
import Parser.SAX.SaxParserHandler;

import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;


public class Main {
    public static void main(String[] args) {
        SaxParserHandler saxParserHandler = null;
        String filePath = args[0];
        
        String[] csArr = filePath.split("\\s");

        SaxMyParser parser = new SaxMyParser();
        Root root = parser.parse(filePath);

    }
}
