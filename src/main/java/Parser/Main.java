package Parser;


import Parser.SAX.SaxMyParser;

public class Main {

    public static void main(String[] args) {
        SaxMyParser parser = new SaxMyParser();
        parser.parse(args[1]);
        SaxMyParser.dataTransferFilter(args);

    }


}


