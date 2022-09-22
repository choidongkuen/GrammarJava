package 기타.스트림;
// https://futurecreator.github.io/2018/08/26/java-8-streams/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest02{

    public static void main(String[] args) {

        String[] arr = {"Java","Python","MySql","JavaScript","C++","Java","Python"};
        ArrayList<String> language = new ArrayList<>(Arrays.asList(arr));

        System.out.println("== filtering ==");
        // 1. filtering
        // 스트림 내 요소들을 하나씩 평가해서 걸러내는 작업이다. 인자로 받는 Predicate 는 boolean 을 리턴하는 함수형 인터페이스로 들어가게 된다.

        Stream<String> stream01 = language.stream().filter(String -> String.contains("a"));
        stream01.forEach(System.out::println);

        // 2. mapping
        // 스트림 내 요소들을 하나씩 특정 값으로 변환해준다.

        System.out.println("\n== Mapping ==");
        Stream<String> stream02 = language.stream().map(String::toUpperCase);
        stream02.forEach(System.out::println);

        // 3. sorting
        // Collectors 를 이용해 정렬한다.

        System.out.println("\n == sorting == ");
        IntStream.of(14,11,20,40,100,-1,-220).sorted().boxed().collect(Collectors.toList()).forEach(System.out::println);


    }
}