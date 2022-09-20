// 기본적으로 제네릭 메소드 내에서는 제네릭으로 선언된 참조변수를 통해서 Object 클래스에 정의된 메소드만 호출이 가능하다.
// 이유 : 모든 자료형을 기반으로 실행이 가능하도록 하기 위함!!


package 제네릭;

interface SimpleInterface{

    public void showYourName(); // 추상 메소드
}

class UpperClass{
    public void showYourAncestor(){

        System.out.println("UpperClass");
    }
}

class AA extends UpperClass implements SimpleInterface{
    public void showYourName(){
        System.out.println("Class AA");
    } // 인터페이스의 메소드 구현
}

class BB extends UpperClass implements SimpleInterface{
    public void showYourName(){
        System.out.println("Class BB");
    } // 인터페이스의 메소드 구현
}

public class Gen07 {

    public static <T> void showInstanceAncestor(T param){
        ((SimpleInterface)param).showYourName(); // SimpleInterface 를 구현하지 않은 인스턴스의 참조값이 와도 실행은 됨.
    }

    public static <T> void showInstanceName(T param){
        ((UpperClass)param).showYourAncestor(); // UpperClass 를 상속하지 않은 인스턴스의 참조값이 와도 실행은 됨.
    }

    public static void main(String[] args) {

        AA aa = new AA();
        BB bb = new BB();

        showInstanceAncestor(aa); // Class AA
        showInstanceName(aa); // UpperClass

        ////////////////////////

        showInstanceAncestor(bb); // Class BB
        showInstanceName(bb); // UpperClass
    }
}

// 제네릭 매개변수는 Object 클래스에 정의된 메소드만 호출 가능 - > 위에 매개변수 param 을 강제 형변환 하고 있다.
// SimpleInterface 나 UpperClass 를 구현하기 않은 인스턴스의 참조 값은 해당 메소드를 전달해도 컴파일은 됨 -> 안전성 떨어짐!!
// 매개변수 타입의 범위를 제한 시켜줄 필요가 있다.
