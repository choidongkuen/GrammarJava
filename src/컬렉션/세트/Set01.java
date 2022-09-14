package 컬렉션.세트;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01 {
    public static void main(String[] args) {

        HashSet<String> hashset = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        hashset.add("4");
        hashset.add("2");
        hashset.add("3");
        hashset.add("1");
        hashset.add("4");
        hashset.add("3");

        linkedHashSet.add("100");
        linkedHashSet.add("101");
        linkedHashSet.add("102");

        treeSet.add("10");
        treeSet.add("20");
        treeSet.add("-1");
        treeSet.add("14");
        treeSet.add("-120");

        System.out.println("===== HashSet =====");
        Iterator<String> hashsetIterator = hashset.iterator(); // 키값만 중복 안되게

        while(hashsetIterator.hasNext())
            System.out.println(hashsetIterator.next());


        System.out.println("===== LinkedHashSet =====");
        Iterator<String> linkedHashSetTIterator = linkedHashSet.iterator(); // 넣는 순서대로 유지

        while(linkedHashSetTIterator.hasNext())
            System.out.println(linkedHashSetTIterator.next());

        System.out.println("===== TreeSet =====");

        Iterator<String> treeSetIterator = treeSet.iterator();
        while(treeSetIterator.hasNext())
            System.out.println(treeSetIterator.next());
    }

}
