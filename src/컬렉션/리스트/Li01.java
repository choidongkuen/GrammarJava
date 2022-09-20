// List 인터페이스를 구현한 클래스의 특징
// 중복 허용
// 저장 순서 유지

// ArrayList = Array(인덱스로 접근) + List(동적 크기)
// 보통 ArrayList 가 LinkedList 보다 사용빈도가 많음

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
import java.util.ArrayList;
import java.util.Arrays;

public class Li01 {
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>(); // ArrayList 선언

        arrList.ensureCapacity(400); // 동적으로 배열 크기를 조절하는건 다소 부담 -> 저장용량의 크기 설정 가능
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5); // 데이터 추가 : add

        arrList.remove(0); // 0번 인덱스 인스턴스의 참조값 삭제
        arrList.remove(Integer.valueOf(2)); // 2 에 값을 갖는 인스턴스의 참조값 삭제

        System.out.println(arrList.get(2)); // 5
        System.out.println(arrList.indexOf(5)); // 2

        arrList.add(6);
        arrList.add(7);
        arrList.add(8);

        Integer[] arr = arrList.toArray(new Integer[0]);
        // 넘어가는 배열 객체의 size() 만큼의 배열로 전환
        // 단 size 가 변경하기 전 ArrayList 보다 작다면 ArrayList 크기로 배열이 생성
        // 반대로 size 가 ArrayList 보다 클 경우, 인자로 넘거가는 배열의 size 로 만들어진다.
        // 왜 new Integer[0] ? : 0은 무조건 ArrayList 의 크기보다 작을 것 즉, ArrayList 크기로 배열이 만들어지기를 의도

        System.out.println(Arrays.toString(arr)); // [3,4,5,6,7,8]
        System.out.println(arrList.contains(4)); // true

        ArrayList<Integer> arrAnotherList = new ArrayList<>();
        arrAnotherList.add(100);
        arrAnotherList.add(20);

        arrList.addAll(arrAnotherList); // 두 컬렉션을 더함 [3,4,5,6,7,8,100,20]
        System.out.println(arrList);

        arrList.set(3,arrList.get(3) * 10);
        System.out.println(arrList);

        arrList.ensureCapacity(arrList.size() * 2); // 현재 가지고 있는 인스턴스 수의 2배의 저장 용량으로 설정
        /*
        System.out.println("========");
        for(Integer element : arrList){
            System.out.print("element = " + element); // 출력
        }
        */
    }


}
