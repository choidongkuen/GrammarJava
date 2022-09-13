// instanceof 연산자에 대해 알아보자.
// 참조 변수 a instanceof 클래스형 A 결과가 true가 나올 조건
// 1. a의 타입과 A가 일치 할 때,
// 2. a가 A의 자식일때,
// 3. a가 원래 본질적으로 A형 이였는데 업캐스팅 된 상태일때(즉 다운캐스팅 가능한 상태) # 비록 a가 A의 부모형이지만!!!

package 오버라이딩;

import java.awt.*;
import java.awt.print.Paper;

class Box{
    public void simpleWrap(){
        System.out.println("simple wrap");
    }
}

class PaperBox extends Box{
    public void paperWrap(){
        System.out.println("paper wrap");
    }
}

class GoldPaperBox extends PaperBox{
    public void GoldPaperBox(){
        System.out.println("gold wrap");
    }
}

public class Over05 {
    public static void isInstance(Box box){ // box로 업캐스팅 된 채로 매개변수 입력
        if(box instanceof GoldPaperBox)
            ((GoldPaperBox)box).GoldPaperBox(); // 형변환 후, GoldPaperBox 메소드 호출
        else if(box instanceof PaperBox)
            ((PaperBox)box).paperWrap(); // ..
        else
            box.simpleWrap();
    }
    public static void main(String[] args) {

        Box box1 = new Box();
        PaperBox box2 = new PaperBox();
        GoldPaperBox box3 = new GoldPaperBox();

        isInstance(box1); // simple wrap
        isInstance(box2); // paper wrap
        isInstance(box3); // gold wrap
    }
}
