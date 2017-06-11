package city;

public class City {

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String cityName;
    private int numberOfPeople;
    private String country;

    public void show() {

        System.out.println("Город " + cityName + "\n" + "Количество жителей " + numberOfPeople + "\n" + "Страна " + country);

    }

    //Вложенный класс ПЛОЩАДЬ
    public class Square {

        public String squareName;

        public String show(String b){
        
            b = "Главная площадь "+squareName;
        return b;
        }
    }
//Вложенный класс УЛИЦА

    public class Street {

        public String streetName;

        public Street(String streetName) {
            this.streetName = streetName;
        }
        public void show(){
        
            System.out.println("Главная улица "+streetName);
        
        }
    }
//Вложенный класс РЕКА

    public class River {

        public String riverName;

        public River(String riverName) {
            this.riverName = riverName;
        }
        
                public void show(){
        
            System.out.println("Главная река "+riverName);
        
        }
    }

}
