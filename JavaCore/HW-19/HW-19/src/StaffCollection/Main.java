package StaffCollection;

public class Main {

    public static void main(String[] args) {

        People director = new People("Alexander", "Lukasenko", 62);

        StaffCollection<People> collection = new StaffCollection(director);

        People premier = new People("Andrej", "Kobijakov", 57);
        People minist1 = new People("Petr", "Prokopovich", 60);
        People minist2 = new People("Vladimir", "Semashko", 60);
        People minist3 = new People("Andrej", "Kosinec", 60);
        People minist4 = new People("Irina", "Afanseva", 53);
        
        
        
        collection.addNew("высшее руководство", premier);

        collection.addNew("Министерство финансов", minist1);

        collection.addNew("Заместители премьер министра", minist2);
        collection.addNew("Заместители премьер министра", minist3);
        collection.addNew("Министерство культуры", minist4);

        System.out.println(collection.getDirector());
        System.out.println(collection.toString());

        
        
        System.out.println("Распечатка с собственным ИТЕРАТОРОМ");
        StaffCollection<People>.CollectionIterator collectionIterator = collection.new CollectionIterator();
        collectionIterator.count();
        while (collectionIterator.hasNext()) {
            System.out.println(collectionIterator.next());
        }

    }

}
