package 추상;

public class Circle extends Figure{

    int r; // 반지름

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }
    public void draw(){
        System.out.println("== 원 그리기 == ");
        System.out.println("좌표값: (" + this.x +", "+ this.y + ")");
        System.out.println("반지름:" + this.r);
    }
}
