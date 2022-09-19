// primitive type 을 reference type 으로 사용하길 원할 때, 사용하는 것이 wrapper class 이다.
// 여기서는 직접 int 형에 대한 클래스를 정의해보겠다.
package WrapperClass;

class IntWrapper {
    private int data;

    IntWrapper(int data) {
        this.data = data;
    }

    public String toString() {
        return "" + this.data; // String
    } // Object 클래스의 toString 오버라이딩
}

public class WC01 {

    public static void showData(Object obj){ // static 메소드
        System.out.println(obj);
    }
    public static void main(String[] args) {

        IntWrapper intInst = new IntWrapper(3);
        showData(intInst);
        showData(new IntWrapper(7));
    }
}
