// 문제 :
// n개의 명령이 주어졌을 때, 각 명령을 수행하는 프로그램을 작성해보세요. 명령의 종류는 크게 3가지 입니다.
// add k v : (k, v) 쌍을 hashmap에 추가합니다. key가 k, value가 v라는 뜻입니다. 이때 만약 동일한 k가 이미 존재한다면, v로 덮어씁니다.
// remove k : key가 k인 쌍을 찾아 hashmap에서 제거합니다. 잘못된 입력은 주어지지 않습니다.
// find k : key가 k인 쌍이 hashmap에 있는지를 판단합니다. 있다면 해당하는 value를 출력하고, 없다면 None을 출력합니다.

// 입력 형식 :
// 첫 번째 줄에는 n이 주어집니다.
// 두 번째 줄 부터는 n개의 줄에 걸쳐 각 명령이 한 줄에 하나씩 주어집니다. 각 명령에 주어지는 key와 value는 전부 숫자입니다. 명령들은 순서대로 수행되어야 합니다.
// 1 ≤ n ≤ 100,000
// 1 ≤ 주어지는 숫자 ≤ 10
// 9

// 입력 예시 :
// 11
// add 3 5
// add 10000 1
// find 3
// find 5
// find 10000
// add 3 10
// find 3
// add 7 15
// remove 3
// remove 7
// find 7

// 출력 예시 :
// 5
// None
// 1
// 10
// None

package 컬렉션.맵;

// 명령어는 add,find,remove
import java.util.*;

public class Map04 {

    public static HashMap<Integer,Integer> hashMap = new HashMap<>(); // hashMap 선언
    public static int n; // 주어지는 명령 수

    public static void main(String[] args) {
        // Your Program Goes Here

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while(n -- > 0){ // n개의 명령어 처리

            String command = sc.next(); // 명령어 입력

            if(command.equals("add")){
                int k = sc.nextInt();
                int v = sc.nextInt();
                hashMap.put(k,v);
            }else if(command.equals("find")){
                int k = sc.nextInt();
                boolean result = hashMap.containsKey(k);
                if(!result)// key가 없다면
                    System.out.println("None");
                else
                    System.out.println(hashMap.get(k));

            }else{ // remove 인 경우

                int k = sc.nextInt();
                hashMap.remove(k);
            }
        }
    }
}