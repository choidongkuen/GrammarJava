package 제네릭;

public class Gen04 {

    public static void main(String[] args) {

        String[] names = {"Java","C++","Python","C#","JavaScript"};
        Double[] scores = {100D,80D,100D,85D,100D};

//        GenMethod genmethod = new GenMethod();
        GenMethod.print(names); // String 배열 출력
        GenMethod.print(scores); // double 배열 출력

        // 형이 다를때마다 print 메서드 추가? -> 제네릭

        System.out.println(GenMethod.getLastItem(names));
        System.out.println(GenMethod.getLastItem(scores));
    }
}
