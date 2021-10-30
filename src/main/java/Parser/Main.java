package Parser;

import Parser.SAX.SaxMyParser;


public class Main {
    public static void main(String[] args) {
//        String filePath = args[0];
        String filePath = "C:\\Users\\st1ch\\Desktop\\Ylab\\out\\artifacts\\Ylab_jar\\test.xml";
        SaxMyParser parser = new SaxMyParser();
        Rot rot = parser.parse(filePath);


    }
}
//C:\Users\st1ch\.jdks\corretto-11.0.10\bin\java

//        "C:\Users\st1ch\.jdks\corretto-11.0.10\bin\java.exe" -jar Ylab.jar -f test.xml -s file-1498940214.xhtml