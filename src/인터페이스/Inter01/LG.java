package 인터페이스.Inter01;

public class LG implements RemoteControl, canCall { // 일종의 다중 상속

    @Override
    public void turnOn() {
        int x = 20; // 인터페이스의 x 보다 더 우선시
        System.out.println("LG 리모콘의 전원을 켭니다.");
        System.out.println(x); // 구현시, 인터페이스의 상수도 사용 가능하구나..
    }

    public void turnOff(){
        System.out.println("LG 리모콘의 전원을 끕니다.");
    }

    public void call() {
        System.out.println("LG 리모콘을 이용해 전화를 받습니다.");
    }
}
