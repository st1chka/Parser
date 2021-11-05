package Parser;


import Parser.SAX.SaxMyParser;

import java.io.FileNotFoundException;

import static Parser.SAX.DataTransferFilter.dataTransferFilter;

public class Main {

    public static void main(String[] args) {
        SaxMyParser parser = new SaxMyParser();
        parser.parse(args[1]);

        dataTransferFilter(args);

    }


}


