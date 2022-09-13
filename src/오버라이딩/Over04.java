// 메서드 오버라이딩 : 하위 클래스에서 상위 클래스에 메소드를 다시 재정의 함으로써, 좀 더 보완하거나, 새로운 것으로 대채하기 위해 사용(다형성)
// 함수의 선언부 ~ 구현부 까지 모두 동일

package 오버라이딩;

class Speaker{
    private int volumeRate; // 인스턴스 변수

    public void showCurrentState(){
        System.out.println("볼륨 크기 : "+this.volumeRate);
    } // 현재 볼륨의 크기를 출력하는 메소드

    public void setVolume(int volumeRate){
        this.volumeRate = volumeRate;
    } // volume 을 설정하는 메소드

}

class BaseEnspeaker extends Speaker{
    private int baseRate; // 인스턴스 변수

    @Override
    public void showCurrentState(){
        super.showCurrentState(); // 상위 클래스의 showCurrentState 메서드 호출(오버라이딩이 되면 상위 클래스의 메소드는 가려짐)
        System.out.println("베이스 크기 : "+this.baseRate);
    }

    public void setBase(int BaseRate){
        this.baseRate = BaseRate;
    }
}
public class Over04 {
    public static void main(String[] args) {
//        BaseEnspeaker be = new BaseEnspeaker();
//        be.showCurrentState();
//        be.setBase(20);
//        be.setVolume(100);
//        be.showCurrentState();

        Speaker s = new BaseEnspeaker();
        s.showCurrentState();
        s.setVolume(10);
//        s.setBase(20); -> 컴파일 에러
        s.showCurrentState(); // 상위 클래스 취급을 받지만, 여전히 메소드 오버라이딩 특성은 살아있음.
        // 인스턴스 변수가 오버라이딩 되는 경우는 참조변수의 자료형에 따라 달라짐(메소드와 반대)



    }
}
