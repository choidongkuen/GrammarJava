// Rectangle 클래스에 내용비교를 위한 equals 메소드를 삽입하자.(Object04 is Rectangle)
// 메소드 오버라이딩 해보자

package 오브젝트;

class Point{
    int x,y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void showPoint(){
        System.out.printf("[%d %d]",this.x,this.y);
    }
    public boolean equals(Point p){
        if(this.x == p.x && this.y == p.y)
            return true;
        return false;
    }
}

class Rectangle {
    Point upperLeft,lowerRight;

    public Rectangle(int x1, int y1, int x2, int y2){

        upperLeft = new Point(x1,y1);
        lowerRight = new Point(x2,y2);
    }
    public boolean equals(Rectangle obj){
        if(this.upperLeft.equals(obj.upperLeft))
            return true;
        return false;
    }
    public void showPosition(){

        System.out.println("직사각형 위치 정보...");
        System.out.print("좌 상단 : ");
        upperLeft.showPoint();
        System.out.print("우 하단 : ");
        lowerRight.showPoint();
        System.out.println("\n");
    }
}

public class Object04{
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(1,1,2,2);
        Rectangle r2 = new Rectangle(1,1,2,2);
        System.out.println(r1.equals(r2));

    }
}
