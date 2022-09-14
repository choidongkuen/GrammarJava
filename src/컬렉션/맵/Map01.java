package 컬렉션.맵;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class Map01 {
    public static void main(String[] args) {

        HashMap<String,String> hashMap = new HashMap<>(); // 키값 중복 제거
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(); // 넣는 순서대로
        TreeMap<String,String> treeMap = new TreeMap<>(); // (키)정렬하여 구조 유지

        hashMap.put("A","A Value");
        hashMap.put("B","B Value");
        hashMap.put("C","C Value");
        hashMap.put("BB","BB Value");

        linkedHashMap.put("A","A Value");
        linkedHashMap.put("B","B Value");
        linkedHashMap.put("C","C Value");
        linkedHashMap.put("BB","BB Value");

        treeMap.put("D","D Value");
        treeMap.put("B","B Value");
        treeMap.put("C","C Value");
        treeMap.put("BB","BB Value");
        treeMap.put("D","D Value");


        System.out.println(" ===== HashMap ===== ");
        for(String key: hashMap.keySet()) {
            System.out.println(key + " : " + hashMap.get(key));
        }

        System.out.println(" ==== LinkedHashMap ==== ");

        for(String key: linkedHashMap.keySet()){
            System.out.println(key + " : " + linkedHashMap.get(key));
        }

        System.out.println(" ==== TreeMap ====");

        for(String key: treeMap.keySet()){
            System.out.println(key + " : " + treeMap.get(key));
        }
    }
}
