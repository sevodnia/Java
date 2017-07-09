package StaffCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class StaffCollection<T> {

    private T director;
    private HashMap<String, Set<T>> staffCollection = new HashMap<>();

    //чтобы создать иерархию сотрудников, нам понададобится конструктор
    //в котором мы сразу должны определить директора
    public StaffCollection(T director) {
        this.director = director;
    }

    void addNew(String department, T value) {
        if (staffCollection.containsKey(department)) {
            staffCollection.get(department).add(value);

        } else if (staffCollection == null) {
            HashSet<T> tmp = new HashSet<>();
            tmp.add(value);
            staffCollection.put(department, tmp);
        } else if (!staffCollection.containsKey(department)) {
            HashSet<T> tmp = new HashSet<>();
            tmp.add(value);
            staffCollection.put(department, tmp);

        }

    }

    @Override
    public String toString() {
        return "Иерархия власти{" + "Президент=" + director + ", вертикаль=" + staffCollection + '}';
    }

    public T getDirector() {
        return director;
    }

    public HashMap<String, Set<T>> getStaffCollection() {
        return staffCollection;
    }

    public void setStaffCollection(HashMap<String, Set<T>> staffCollection) {
        this.staffCollection = staffCollection;
    }

    public class CollectionIterator implements Iterator {

        int index = 0;
        Object[] array = staffCollection.keySet().toArray();
        ArrayList<T> list = new ArrayList<>();

        public void count() {
            for (int i = 0; i < array.length; i++) {
                String str = (String) array[i];
                Set<T> tmpl = staffCollection.get(str);
                list.addAll(tmpl);
            }
        }

        @Override

        public boolean hasNext() {
            if (index < list.size()) {
                return true;
            }

            return false;

        }

        @Override
        public Object next() {
            return list.get(index++);
        }

    }

}
