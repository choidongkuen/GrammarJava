// Map<K,V>

// 메소드 :
// put(K key, V value) # key-value 순서쌍 저장
// putAll(Map m) # 해당 컬렉션을 추가
// remove(Object key) # key 값을 가지는 value 삭제
// size() # 크기 반환
// isEmpty() # 컬렉션이 비어있는지 확인
// values() # 모든 values 값을 컬렉션 형태로 출력
// get(Object key) # key 해당하는 value 반환
// clear() # 모든 데이터 삭제
// clone() # 복제(얕은 복사)
// containsKey(Object key) # key 존재하는지 여부 확인
// containsValue(Object value) # value 존재하는지 여부 확인
// entrySet() # 모든 엔트리를 set 형태로 반환
// keySet() # 모든 key 를 set 형태로 반환
// getOrDefault(K,D) # key 값을 통해 value 얻을 시, 없으면 D 반환(원래 없으면 에러 발생)

package 컬렉션.맵;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class Map01 {
    public static void main(String[] args) {

        HashMap<String,String> hashMap = new HashMap<>(); // 키값 중복 제거 -> 넣을 때, hash 기능을 통해 빠른 탐색
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

        System.out.println(" ===== HashMap EntrySet ===== ");
        System.out.println(hashMap.entrySet());
        System.out.println();

        System.out.println(" ===== HashMap Keyset ===== ");
        System.out.println(hashMap.keySet());
        System.out.println();

        System.out.println(" ===== HashMap Values ===== ");
        System.out.println(hashMap.values());
        System.out.println();

        System.out.println(" ===== HashMap ===== ");
//        for(String key: hashMap.keySet()) {
//            System.out.println(key + " : " + hashMap.get(key));
//        }
        System.out.println(hashMap);
        System.out.println();

        System.out.println(" ===== HashMap Clone ===== ");
        HashMap<String,String> anotherHashMap = (HashMap<String, String>)hashMap.clone();
        System.out.println(anotherHashMap);
        System.out.println();

        hashMap.put("CC","CC Value"); // hashMap 쌍 추가
        hashMap.replace("A","AA Values"); // hashMap value 값 변경


        System.out.println(hashMap);
        System.out.println(anotherHashMap); // anotherHashMap 에는 변화 반영 x -> clone : 얕은 복사
        System.out.println();

        System.out.println("======================================");
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
