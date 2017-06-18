package parsing;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Handler extends DefaultHandler {

    ArrayList<People> array = new ArrayList<>();
    People people = new People();
    private String thisElement;

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start parsing");

    }

    @Override
    public void endDocument() {
        System.out.println("End parsing");

    }

    @Override
    public void startElement(String namespace, String localName, String qName, Attributes attr) {
        thisElement = qName;

    }

    @Override
    public void endElement(String namespace, String localName, String qName) throws SAXException {

        thisElement = "";

    }

    @Override
    public void characters(char[] ch, int start, int end) {

        if (thisElement.equals("age")) {
            people.setAge(new Integer(new String(ch, start, end)));
        }

        if (thisElement.equals("id")) {
            people.setId(new Integer(new String(ch, start, end)));
        }
        if (thisElement.equals("isDegree")) {
            people.setIsDegree(Boolean.parseBoolean(new String(ch, start, end)));
        }
        if (thisElement.equals("name")) {
            people.setName(new String(ch, start, end));

        }
        if (thisElement.equals("surname")) {
            people.setSurname(new String(ch, start, end));


        }

    }

    public ArrayList<People> getResult() {
        return array;
    }

}
