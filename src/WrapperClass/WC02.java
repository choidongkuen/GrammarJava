// WC01 처럼 직접 primitive type 데이터를 refernce 형으로 쓸 때마다 클래스를 생성하는건 비효율적
// 자바에서는 이미 Wrapper Class 를 정의해 놓았다.

// Character 클래스를 제외한 클래스들은 문자열의 참조값을 인자로 받을 수 있다!
// (참고) 암묵적 형변환 : byte - > char,short - > int - > long - > float - > double

package WrapperClass;

public class WC02 {
    public static void showData(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Integer intInst = new Integer(3);
        showData(intInst);
        showData(new Integer(10));

        Byte byteInst = new Byte("2"); // 문자열을 인자로 받을 수 있음
        showData(byteInst);

        Character charInst = new Character('호');
        showData(charInst);

    }
}
