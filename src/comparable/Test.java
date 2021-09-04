package comparable;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        System.out.println(peopleList);
        System.out.println(peopleSet);
    }

    private static void addElements(Collection collection){
        collection.add(new Person(1, "Gala Jsllflsfk"));
        collection.add(new Person(7, "Sergio Kks"));
        collection.add(new Person(3, "Natasha Olkfk"));
        collection.add(new Person(9, "Kola Kmslklksdgkjlksd"));
    }
}

class Person implements Comparable<Person>{
    int id;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public int compareTo(Person o) {
//        if(this.id > o.getId()){
//            return 1;
//        } else if (this.id < o.getId()){
//            return -1;
//        }else {
//            return 0;
//        }
//    }

    @Override
    public int compareTo(Person o) {
        if(this.name.length() > o.getName().length()){
            return 1;
        } else if (this.name.length() < o.getName().length()){
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
