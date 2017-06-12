package cityNewVersion;

public class City {

    private Name street;
    private Name square;
    private Name river;

    public static void main(String[] args) {
        City city = new City();
        city.start();
    }

    public void start() {

        Name street = this.new Name();
        Name square = this.new Name();
        Name river = new City().new Name();

        street.setName("PROSPECT NEZAVISIMOSTI");
        square.setName("OCTJABARSKAJA");
        river.setName("SVISLOCH");

        System.out.println(street.name + " " + square.name + " " + river.name);

    }

    public class Name {

        String name;

        public void setName(String name) {
            this.name = name;

        }

    }

}
