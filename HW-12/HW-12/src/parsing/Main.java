package parsing;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

public class Main {

    public static void main(String[] args) {
        SAXParserFactory parserF = SAXParserFactory.newInstance();
        Handler handler = new Handler();
        try {
            SAXParser saxparser = parserF.newSAXParser();
            saxparser.parse(new File("src/test.xml"), handler);
        } catch (ParserConfigurationException |IOException | SAXException ex) {
            ex.printStackTrace();
        } 

        
        System.out.println(handler.getResult().toString()); 
        
    }
}
