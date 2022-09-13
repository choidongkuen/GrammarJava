package 인터페이스.Inter01;

import 인터페이스.Inter01.RemoteControl;

public class Samsung implements RemoteControl {

    @Override
    public void turnOn(){
        System.out.println("삼성 리모콘을 켭니다.");
    }
    public void turnOff() {
        System.out.println("삼성 리모콘을 끕니다.");
    }

    public void listen(){
        System.out.println("삼성 리모콘을 이용해 음악을 듣습니다.");
    }
}
