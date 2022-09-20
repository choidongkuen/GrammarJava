// 제네릭 메소드에는 둘 이상의 타입 매개변수 정의도 가능하다!! Ex) < K, V >
// 제네릭 클래스에도 둘 이상의 타입 매개변수 정의 가능

/* 제네릭 클래스 예시
class GenericTwoParam<T,U>{
    T item1;
    U item2;

    public void setItem1(T item){
        this.item1 = item;
    }

    public void setItem2(U item){
        this.item2 = item;
    }
}
*/

package 제네릭;

class AAAA{
    public String toString(){return "AAAA class";}
}

class BBBB{
    public String toString(){return "BBBB class";}
}

class CCCC{
    public String toString(){return "CCCC class";}
}

class InstanceTypeShower2{

    public <T,U> void showInstType(T inst1, U inst2){ // 2개의 매개변수 타입

        System.out.println(inst1);
        System.out.println(inst2);
    }
}
public class Gen06 {
    public static void main(String[] args) {

        AAAA aaaa = new AAAA();
        BBBB bbbb = new BBBB();
        CCCC cccc = new CCCC();

        InstanceTypeShower2 shower = new InstanceTypeShower2();
        shower.<AAAA,BBBB>showInstType(aaaa,bbbb);
        shower.<BBBB,CCCC>showInstType(bbbb,cccc);
    }
}
