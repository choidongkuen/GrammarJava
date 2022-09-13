package 인터페이스.Inter01;

public class LG implements RemoteControl, canCall { // 일종의 다중 상속

    @Override
    public void turnOn() {
        System.out.println("LG 리모콘의 전원을 켭니다.");
    }

    public void turnOff(){
        System.out.println("LG 리모콘의 전원을 끕니다.");
    }

    public void call() {
        System.out.println("LG 리모콘을 이용해 전화를 받습니다.");
    }
}
