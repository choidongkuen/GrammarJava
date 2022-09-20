// LinkedList 도 ArrayList 와 사용방법이 거의 동일
// 두 컬렉션 클래스는 인스ㅌ너스를 저장하는 방식에서 차이가 있다.

// 메소드 :
// add(Object obj) # 인스턴스 추가
// remove(int index) # 인덱스 값 삭제
// remove(Object obj) # 인스턴스 삭제
// get(int index) # 인덱스 값 반환
// set(int index, Object obj) # 인덱스 값 변경
// indexOf(Object obj) # 인스턴스의 첫번째 인덱스 반환
// lastIndexOf(Object obj) # 인스턴스의 마지막 인덱스 반환
// clear() # ArrayList 인스턴스 모두 삭제
// isEmpty() # ArrayList 비어있는지 여부 확인
// size() # ArrayList 크기 반환
// contains(Object obj) # 인스턴스 존재 여부 확인
// toArray() # 일반 배열 타입으로 반환(저장할 배열 타입에 맞춰 자동 형변환, 배열 크기 또한 자동으로 맞춰서 변경)
// addAll(Collection c) # 두 컬렉션을 합침

package 컬렉션.리스트;

import java.util.LinkedList;

public class Li02 {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

//        linkedList.ensureCapacity(200) # 불가
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println(linkedList.remove(0)); // 삭제 한 후, 출력
        linkedList.remove(Integer.valueOf(2));

        System.out.println(linkedList.get(3));
        System.out.println(linkedList.isEmpty());

        linkedList.clear();

        System.out.println(linkedList);
    }
}
