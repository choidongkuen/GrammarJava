// 제네릭 메소드란 클래스 내부에 존재하는 제네릭 특성을 가진 메소드이며, 타입 매개변수의 범위는 메소드 내부로 제한됨

package 제네릭;

class AAA{
    public String toString(){return "Class AAA";}
}

class BBB{
    public String toString(){return "Class BBB";}
}

class CCC{
    public String toString(){return "Class CCC";}
}

class InstanceTypeShower{
    int showCnt = 0;

    public <T> void showInstType(T inst){ // 제네릭 메소드 !!
        System.out.println(inst); // inst 형의 toString 메소드 호출
        showCnt ++;
    }

    void showPrintCnt(){
        System.out.println("횟수 : " + this.showCnt);
    }
}

public class Gen05 {
    public static void main(String[] args) {

        AAA aaa = new AAA();
        BBB bbb = new BBB();
        CCC ccc = new CCC();

        InstanceTypeShower shower = new InstanceTypeShower();

        shower.showInstType(aaa);
        shower.showInstType(bbb);
        shower.showInstType(ccc);

        shower.showPrintCnt();
    }
}
