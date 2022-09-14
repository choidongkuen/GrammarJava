package 컬렉션.벡터;
import java.util.Vector;

public class Ve01 {
    public static void main(String[] args) {

        Vector vector = new Vector();
        vector.add("홍길동");
        vector.add("남자");
        vector.add(25);
        vector.add(80.15); // add 데이터 저장

        System.out.println(vector.get(0));
        System.out.println(vector.get(1)); // get 데이터 가져오기

        String name = (String)vector.get(0); // but Object로 가지고 있기 때문에, 형변환 필요!

    }
}
