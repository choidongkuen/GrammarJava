// 제네릭 메소드에는 둘 이상의 타입 매개변수 정의도 가능하다!! Ex) < K, V >

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
