// Object 클래스는 모든 클래스의 최상위 클래스이다.
// finallize() -> 인스턴스 소멸시 JVM 에 의해 자동으로 호출되는 메소드이다.

package 오브젝트;

class MyName{
    String objName;
    public MyName(String name){
        this.objName = name;
    }

    protected void finalize() throws Throwable{
        super.finalize();
        System.out.println(objName + " 이 소멸되었습니다.");
    } // Object 의 finalize 메소드 오바라이딩
}

public class Object01 {
    public static void main(String[] args) {

        MyName obj1 = new MyName("인스턴스 1");
        MyName obj2 = new MyName("인스턴스 2");
        obj1 = null;
        obj2 = null; // 참조변수 해제 - > GC의 대상이 되었다.

        System.out.println("프로그램을 종료합니다.");
        System.gc(); // 명시적인 가비지 컬렉션은 프로그램 성능에 문제가 될 수 있음 -> 명시적 호출 필요(참조변수가 참조하는 인스턴스가 null이 되었다 : GC의 대상이 된 것 뿐)
        System.runFinalization();
    }
}
