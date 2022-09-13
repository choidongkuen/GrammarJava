package 추상;

public class Rectangle extends Figure{

    int length;
    int height;

    public Rectangle(int x, int y,int length, int height){
        super(x,y); // 상위 클래스 생성자 호출 및 실행
        this.length = length;
        this.height = height;

    }
    public void draw(){
        System.out.println(" == 사각형 그리기 == ");
        System.out.println("좌표값: (" + this.x + ", " + this.y +")");
        System.out.println("길이:"+ this.length +", "+"높이:" + this.height);
    }
}
