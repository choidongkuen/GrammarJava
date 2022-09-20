// 클래스 생성시 클래스 내부에서 사용되는 변수의 클래스형이 매번 다를 때는 어떻게 해야 할까?
// ex) 언제는 Apple 자료형 언제는 Orange 자료형 언제는 Grape 자료형...
// 모든 클래스형에 대해 클래스를 생성해야 하나? -> 일단 모든 인스턴스를 참조값으로 가질 수 있는 Object 클래스(자료형)을 이용해보자.
package 제네릭;


class Orange{
    int sugarContent; // 오렌지의 당도 함량
    public Orange(int sugarContent){
        this.sugarContent = sugarContent;
    }
    public void showSugarContent(){
        System.out.println("오렌지의 당도 : " + this.sugarContent);
    }
}

class FruitBox{
    Object item; // 모든 과일을 담을 수 있는 Object 클래스형 변수 선언
    public void store(Object obj){
        this.item = obj;
    } // 저장하는 매소드

    public Object pullOut(){
        return this.item;
    } // 꺼내는 메소드
}
public class ObjectBaseFruitBox {
    public static void main(String[] args) {

        FruitBox fb1 = new FruitBox();
        fb1.store(new Orange(10)); // Orange 형 변수 저장

        Orange org1 = (Orange)fb1.pullOut(); // 형변환 필수 -> Object 로 표현하는 것의 단점(실수 가능성)
        org1.showSugarContent(); // 당도 함량 출력

        FruitBox fb2 = new FruitBox();
        fb2.store("Orange"); // Orange 형 변수 저장 -> store 메소드는 Object 매개변수를 갖기 때문에 우리가 의도치 않은 문자열을 store 메소드에 전달해도 컴파일 에러를 일으키지 않는다 !!(매우 큰 문제점)

        Orange org2 = (Orange)fb2.pullOut(); // 동일
        org2.showSugarContent(); // 당도 함량 출력
    }
}

// 정리 : 결국 다양한 자료형을 포용하기 위해 Object 클래스로 처리하게 되면 실수가 날 가능성이 매우 높으며, 형변환 과정이 필수불가결하게 수반된다. -> 안전성이 떨어짐!!!
// 제네렉 사용의 이유!!!
