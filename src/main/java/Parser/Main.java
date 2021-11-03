package Parser;

import Parser.SAX.Root;
import Parser.SAX.SaxMyParser;
import Parser.SAX.SaxParserHandler;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        SaxMyParser parser = new SaxMyParser();
        parser.parse(args[1]);
        SaxMyParser.dataTransferFilter(args);

    }


}


