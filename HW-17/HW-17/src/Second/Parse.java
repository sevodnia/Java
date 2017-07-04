package Second;
//Parse interface - служит для того, чтобы у ParseXML и //ParseJSON были одинаковые методы доступа
interface Parse {
    
public Root parseFile();
public String getLink();
public String getStore();
}

