package parse;
//Parse interface - служит для того, чтобы у ParseXML и //ParseJSON были одинаковые методы доступа

import student.Root;


public interface  Parse {

    public Root parseFile();

    public String getLink();

    public String getStore();
}
