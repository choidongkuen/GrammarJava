// 그렇다면 IS-A 관계가 아닌 HAS-A 관계도 구현해보면서 상속에 적절한지 판단해 보자.
// 경찰은 총을 가졌다. ( 하위 클래스 : Police , 상위 클래스 : Gun)
package 오버라이딩;


class Gun{

    int bullet; // 총알 수

    Gun(int bullet){
        this.bullet = bullet;
    }

    public void shot(){
        if(this.bullet == 0){
            System.out.println("남아있는 총알이 없습니다.");
            return;
        }
        System.out.println("빵!");
        this.bullet -= 1;
    }

    public void showInfo(){
        System.out.println(String.format("남아있는 총알 : %d",this.bullet));
    }
}

class Police extends Gun{ // 총을 '가지는' 경찰 클래스

    int handCuffs; // 수갑 수

    public Police(int bullet,int handCuffs){
        super(bullet);
        this.handCuffs = handCuffs;
    }

    public void putHandCuffs(){
        if(this.handCuffs == 0){
            System.out.println("남아있는 수갑이 없습니다.");
            this.handCuffs -= 1;
        }
        System.out.println("수갑 온!");
        this.handCuffs -= 1;
    }

    @Override
    public void showInfo(){
        System.out.println(String.format("남아있는 수갑 : %d",this.handCuffs));
    }
}

public class Over02 {
    public static void main(String[] args) {
        Police p1 = new Police(20,2);
        p1.shot(); // 경찰이 총을 쏨
        p1.putHandCuffs(); // 경찰이 수갑을 채움
        p1.putHandCuffs(); // 경찰이 수갑을 채움

        p1.showInfo(); // 하위 클래스의 메소드가 호출(-> 상위 클래스의 메소드는 가려짐)


    }
}


// 상속으로 묶인 두 클래스는 강한 연관성을 띄게 됨. 따라서 다른 것을 추가시 많은 제약이 생김
// 확장이 어렵다.(from 하위 클래스의 입장)