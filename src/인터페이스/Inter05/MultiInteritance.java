// 인터페이스와 클래스의 조합으로 다중상속 구현해보기

package 인터페이스.Inter05;

class TV{
    public void tvOn(){
        System.out.println("영상 출력 중");
    }
}

interface Computer{
    public void dataReceive(); // 추상 메소드
}

class ComputerImp {
    public void dataReceive(){
        System.out.println("영상 데이터 수신 중");
    }
}

class IPTV extends TV implements Computer{

    ComputerImp comp = new ComputerImp();

    public void dataReceive(){ // 추상 메소드 구현
        comp.dataReceive(); // ComputerImp 의 메소드 호출
    }
    public void powerOn(){
        dataReceive(); // 클래스 내의 메소드 호출
        tvOn(); // 상위 클래스의 메소드 호출
    }
}


public class MultiInteritance {
    public static void main(String[] args) {
        IPTV iptv = new IPTV();
        iptv.powerOn();

        TV tv = iptv; // 업캐스팅
        Computer computer = iptv; // 일종의 업캐스팅

    }
}
