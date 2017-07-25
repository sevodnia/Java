package city;

public class Main {

    public static void main(String[] args) {

        //создаем и инициализируем объект CITY
        City city = new City();
        city.setCityName("MINSK");
        city.setCountry("BELARUS");
        city.setNumberOfPeople(2200000);
        city.show();

        //создаем и инициализируем объект SQUARE
        City.Square square = new City().new Square();
        square.squareName = "OCTJABARSKAJA";
        String b = square.show(square.squareName);
        System.out.println(b);

        //создаем и инициализируем объект STREET
        City.Street street = new City().new Street("PROSPECT NEZAVISIMOSTI");
        street.show();

        //создаем и инициализируем объект RIVER
        City.River river = new City().new River("SVISLOCH");
        river.show();

    }

}
