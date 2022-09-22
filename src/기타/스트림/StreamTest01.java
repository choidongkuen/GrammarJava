// 스트림 Streams

// 자바 8에서 추가한 스트림(Streams)은 람다를 활용할 수 있는 기술 중 하나입니다. 자바 8 이전에는 배열 또는 컬렉션 인스턴스를 다루는 방법은 for 또는 foreach 문을 돌면서 요소 하나씩을 꺼내서 다루는 방법이었습니다.
// 간단한 경우라면 상관없지만 로직이 복잡해질수록 코드의 양이 많아져 여러 로직이 섞이게 되고, 메소드를 나눌 경우 루프를 여러 번 도는 경우가 발생합니다.
// 스트림은 '데이터의 흐름’입니다. 배열 또는 컬렉션 인스턴스에 함수 여러 개를 조합해서 원하는 결과를 필터링하고 가공된 결과를 얻을 수 있습니다.
// 또한 람다를 이용해서 코드의 양을 줄이고 간결하게 표현할 수 있습니다. 즉, 배열과 컬렉션을 함수형으로 처리할 수 있습니다.

// 스트림 Streams 특징
// 1. 스트림은 데이터 소스로 부터 데이터를 읽기만 할 뿐, 변경하지 않는다.
// 2. 스트림은 한번 사용하면 닫혀서 다시 사용할 수 없다.
// 3. 스트림은 작업을 내부 반복으로 처리한다.

package 기타.스트림;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest01 {

    public static void main(String[] args) {

        Stream<String> basicStream;

        // 1. 배열 스트림

        String[] arr = {"Hello","Hi","Good Night","Bye"};
        Stream<String> Arrstream = Arrays.stream(arr);
        Stream<String> subArrStream = Arrays.stream(arr,1,3);
//        Arrstream.forEach(System.out::println); // 출력하는 법

        // 2. 컬렉션 스트림

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(arr));
        arrList.add("최동근");
        arrList.add("경기도시흥시");
        arrList.add("배곧1로");
        arrList.add("한라비발디캠퍼스");

        Stream<String> CollectionStream = arrList.stream(); // 컬렉션 타입은 메소드로 호출
        Stream<String> parallelStream = arrList.parallelStream(); // 병렬 처리 스트림

        // 3. Stream.builder() -> 스트림에 직접적으로 원하는 값을 넣을 수 있다.

        Stream<String> builderStream = Stream.<String>builder().add("최동근").add("제로베이스").build();

        // 4. 기본 타입형 스트림

        IntStream intStream = IntStream.range(1,5); // 끝 범위 포함 x
        LongStream doubleStream = LongStream.rangeClosed(10000,2000000); // 끝 범위 포함 o
    }
}
