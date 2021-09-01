package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("sj");
        animals.add("jerjrj");
        animals.add("aerutrjejjere");
        animals.add("kethh");
        animals.add("xsr");
        animals.add("bwuu5tuww");
        animals.add("qwutwujkkykggmki");
        animals.add("gfmhmhfghgg");

        Collections.sort(animals);
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(8);
        numbers.add(4);

        Collections.sort(numbers);
        System.out.println(numbers);

        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

        Collections.sort(numbers, new BackwardsNumberComparator());
        System.out.println(numbers);

        List<Person> person = new ArrayList<>();

        person.add(new Person(14, "Mike"));
        person.add(new Person(8, "Lena"));
        person.add(new Person(63, "Alex"));
        person.add(new Person(33, "Vlad"));
        person.add(new Person(1, "Sasha"));
        person.add(new Person(6, "Kate"));

        Collections.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getId() > o2.getId()){
                    return 1;
                } else  if (o1.getId() < o2.getId()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println(person);
    }
}

class StringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        /*
        o1 > o2 => 1;
        o1 < o2 => -1;
        o1 == o2 => 0;

        compare(2, 1) => 1;
        compare(1, 2) => -1;
        compare(1, 1) => 0;
         */
        if(o1.length() > o2.length()){
            return 1;
        } else if (o1.length() < o2.length()){
            return -1;
        } else {
            return 0;
        }
    }
}

class BackwardsNumberComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 < o2){
            return 1;
        } else  if(o1 > o2){
            return  -1;
        } else {
            return 0;
        }
    }
}

class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
