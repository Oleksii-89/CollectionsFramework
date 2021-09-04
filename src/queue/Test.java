package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);
        Person person5 = new Person(5);

        Queue<Person> people = new LinkedList<>();
        people.add(person3);
        people.add(person5);
        people.add(person1);
        people.add(person2);
        people.add(person4);

        for(Person person : people)
            System.out.println(person);

        System.out.println("\n" + people.remove() + "\n");
        System.out.println(people.peek() + "\n");
        System.out.println(people);
    }
}

class Person {
    int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
