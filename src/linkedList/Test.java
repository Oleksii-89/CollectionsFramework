package linkedList;

import java.util.List;

public class Test {
    public static void main(String[] args) {

//        List<Integer> linkedList = new LinkedList<>();
//        linkedList.add(1);
//        linkedList.get(0);
//        linkedList.size();
//        linkedList.remove(0);
//
//        List<Integer> arrayList = new ArrayList<>();
//
//        measureTime(linkedList);
//        measureTime(arrayList);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(34);

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(0));

        myLinkedList.remove(1);

        System.out.println(myLinkedList);

    }

    public static void measureTime(List list){

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }

//        for (int i = 0; i < 100000; i++) {
//            list.get(i);
//        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
