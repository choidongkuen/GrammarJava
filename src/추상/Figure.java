// 추상 메소드 : 메서드의 구현부가 없는 메소드이며, 해당 추상 메소드가 속해있는 추상 클래스를 상속하는 클래스가 오버라이딩 해야함
// 추상 클래스 : 특정 목적을위해 공통적인 기능들을 구현해놓고, 특정 클래스가 그 기능들이 필요하면 상속받아 구현하도록 하는 클래스
// not complete => abstract

package 추상;

public abstract class Figure {
    protected int x;
    protected int y;

    public Figure(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void showData(){
        System.out.println("x 좌표 : "+this.x+", y좌표 : " + this.y);
    }
    public abstract void draw(); // 추상 메서드

}
