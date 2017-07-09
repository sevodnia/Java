package project;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ParseXML implements Parse {

    private static final String LINK = "http://kiparo.ru/t/student.xml";
    private static final String STORE = "students.xml";
    Root root = null;

    @Override
    public Root parseFile() {
        //главный метод

        SAXParserFactory factory = SAXParserFactory.newInstance();
        DefaultHandler handler = new DefaultHandler() {
            //создаем ананимный класс и прописываем, каким образом будем парсить файл

            ArrayList<Student> students = new ArrayList<>();
            Student student = null;
            private String thisElement = "";

            @Override
            public void startDocument() throws SAXException {
                System.out.println("Начинаем парсинг XML");
            }

            @Override
            public void endDocument() {
                System.out.println("Заканчиваем парсинг XML");
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
                if (thisElement.equals("root")) {
                    root = new Root();
                    return;
                }

                if (thisElement.equals("name") && student == null) {
                    root.setName(new String(ch, start, end));
                    return;
                }

                if (thisElement.equals("location")) {
                    root.setLocation(new String(ch, start, end));
                }
                if (thisElement.equals("students")) {
                    root.setStudents(students);
                    student = new Student();
                }
                if (thisElement.equals("id")) {
                    student.setId(new Integer(new String(ch, start, end)));
                }

                if (thisElement.equals("name")) {
                    student.setName(new String(ch, start, end));

                }

                if (thisElement.equals("degree")) {
                    student.setDegree(new String(ch, start, end));

                }

                if (thisElement.equals("dateOfBirth")) {
                    SimpleDateFormat tmp = new SimpleDateFormat("yyyy-MM-dd");
                    try {
                        student.setDateOfBirth(tmp.parse(new String(ch, start, end)));
                    } catch (ParseException ex) {
                        System.out.println("Ошибка парсинга даты в XML");
                    }

                }

                if (thisElement.equals("rating")) {
                    student.getRating().add(new Integer(new String(ch, start, end)));
                }

                if (thisElement.equals("visible")) {
                    student.setVisible(Boolean.parseBoolean(new String(ch, start, end)));
                    students.add(student);
                }

            }

        };

        try {
            SAXParser parser = factory.newSAXParser();
            parser.parse(new File(STORE), handler);
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            System.out.println("Ошибка парсинга файла" + ex.getMessage());
        }

        return root;

    }

    @Override
    public String getLink() {
        return LINK;
    }

    @Override
    public String getStore() {
        return STORE;
    }

}
