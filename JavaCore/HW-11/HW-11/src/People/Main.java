package People;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<People> men = new ArrayList<>();
        ArrayList<People> women = new ArrayList<>();

        men.add(new People("Marilyn", "Mansonovich", "Manson"));
        men.add(new People("Arnold", "Genrihovich", "Shwarcnegger"));
        men.add(new People("Red", "Hot", "Pepper"));
        men.add(new People("Vladimir", "Iosifovich", "Smirmoff"));
        men.add(new People("Isaak", "Adolfovich", "Blueminshtein"));

        women.add(new People("Clara", "Genrihovna", "Cetkin"));
        women.add(new People("Rosa", "Genrihovna", "Luksemburg"));
        women.add(new People("Clara", "Genrihovna", "Novikova"));
        women.add(new People("Coco", "Genrihovna", "Shanel"));
        women.add(new People("Sofija", "Genrihovna", "Ogerkova"));

        HashMap<String, ArrayList<People>> allOfThem = new HashMap<String, ArrayList<People>>();

        allOfThem.put("man", men);
        allOfThem.put("woman", women);

        for (String key : allOfThem.keySet()) {
            System.out.println("key =" + key + " value = " + allOfThem.get(key));

        }

        Scanner scan = new Scanner(System.in);

        System.out.println("Put the gender person of what you want to observe: man/woman ");
        String gotIt= scan.nextLine();
        Random random = new Random();
        //выводим рандомный объект класса People из нужного нам ArrayList 
        System.out.println(allOfThem.get(gotIt).get(random.nextInt(allOfThem.get(gotIt).size())));
    }

}
