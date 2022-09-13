package 추상;

public class Triangle extends Figure {
    int length;
    int height;

    public Triangle(int x, int y, int length, int height){
        super(x,y); // 상위 클래스의 생성자 호출 및 실행
        this.length = length;
        this.height = height;
    }

    public void draw(){
        System.out.println(" == 삼각형 그리기 == ");
        System.out.println("좌표값: (" + x +", " + y + ")");
        System.out.println("좌표값 기준으로 x축으로 " + length + "만큼 이동");
    }
}
