// HAS_A 관계는 상속을 이용한 구현은 지양!
// Over02 에 더 나은 ver.

// 즉 Police 클래스 안에 Gun 클래스 형의 참조 변수를 선언해주어, 동시에 관리한다 !!!

package 오버라이딩;

class Gun1{

    private int bullet;

    public Gun1(int bullet){
        this.bullet = bullet;
    }
    public void shot(){
        if(this.bullet == 0){
            System.out.println("남아있는 총알이 없습니다.");
            return;
        }
        System.out.println("삥!");
        this.bullet -= 1;
    }
    public int getBullet(){ // getter
        return this.bullet;
    }
    public void setBullet(int bullet){ // setter
        this.bullet = bullet;
    }
}

class Police1{

    private int handCuffs;
    Gun1 pistol;

    public Police1(int handCuffs,int bullet){
        this.handCuffs = handCuffs;
        pistol = new Gun1(bullet); // Gun1의 참조변수를 이용하여 상속을 지양
    }

    public void putHandCuffs(){
        if(this.handCuffs == 0){
            System.out.println("남아있는 수갑이 없습니다.");
            return;
        }
        System.out.println("수갑 온!");
        this.handCuffs -= 1;
    }

    public void showInfo(){
        System.out.println(String.format("남아있는 총알은 : %d",pistol.getBullet()));
        System.out.println(String.format("남아있는 수갑은 : %d",this.handCuffs));
    }

    public void shot(){
        if(this.pistol.getBullet() == 0){
            System.out.println("남아있는 총알이 없습니다.");
            return;
        }
        System.out.println("빵!");
        this.pistol.setBullet(this.pistol.getBullet() - 1);
    }
}

public class Over03 {
    public static void main(String[] args) {
        Police1 p1 = new Police1(2,5); // 수갑 2개 , 총알 5발
        p1.showInfo();
        p1.shot();
        p1.shot();
        p1.shot();

        p1.showInfo();
    }
}
