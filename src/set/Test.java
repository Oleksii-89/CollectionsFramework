package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {


        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(0);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);

        set2.add(0);
        set2.add(3);
        set2.add(5);
        set2.add(9);
        set2.add(1);
        set2.add(4);
        set2.add(7);

        //Union - obedinenie
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        //Intersection - peresechenie
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        //Difference - raznost mnojestw

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);








//        Set<String> hashSet = new HashSet<>();
//        Set<String> linkedHashSet = new LinkedHashSet<>();
//        Set<String> treeSet = new TreeSet<>();
//
//        hashSet.add("Mike");
//        hashSet.add("Molly");
//        hashSet.add("Alex");
//        hashSet.add("Kate");
//        hashSet.add("Dima");
//        hashSet.add("Masha");



//
//        for(String set : hashSet){
//            System.out.println(set);
//        }
//        System.out.println("\n");
//
//        linkedHashSet.add("Mike");
//        linkedHashSet.add("Molly");
//        linkedHashSet.add("Alex");
//        linkedHashSet.add("Kate");
//        linkedHashSet.add("Dima");
//        linkedHashSet.add("Masha");
//
//        for(String linked : linkedHashSet){
//            System.out.println(linked);
//        }
//
//        System.out.println("\n");
//
//        treeSet.add("Mike");
//        treeSet.add("Molly");
//        treeSet.add("Alex");
//        treeSet.add("Kate");
//        treeSet.add("Dima");
//        treeSet.add("Masha");
//
//        for (String tree : treeSet){
//            System.out.println(tree);
//        }

    }
}
