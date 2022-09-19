package 오브젝트;

class Coordinate implements Cloneable{
    private int xPos;
    private int yPos;

    public Coordinate(int x, int y){
        this.xPos = x;
        this.yPos = y;
    }

    public void showPosition(){
        System.out.printf("[%d %d]", this.xPos,this.yPos);
    }

    public void changePos(int x, int y){
        this.xPos = x;
        this.yPos = y;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class Rectangle02 implements Cloneable{
    Coordinate upperLeft,lowerRight;

    public Rectangle02(int x1,int y1,int x2, int y2){
        this.upperLeft = new Coordinate(x1,y1);
        this.lowerRight = new Coordinate(x2,y2);
    }

    public void showPosition(){
        System.out.println("직사각형 위치정보 ....");
        System.out.print("좌 상단 : ");
        upperLeft.showPosition();
        System.out.println();

        System.out.print("우 하단 : ");
        lowerRight.showPosition();
        System.out.println("\n");
    }

    public void changePos(int x1, int y1, int x2, int y2){
        upperLeft.changePos(x1,x2);
        lowerRight.changePos(x2,y2);
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class Object06 {
    public static void main(String[] args) {
        Rectangle02 org = new Rectangle02(1,1,9,9);
        Rectangle02 cpy;
        org.showPosition();

        try{
            cpy = (Rectangle02)org.clone();
            cpy.showPosition();
            org.changePos(2,2,7,7); // 값 변경
            org.showPosition();
            cpy.showPosition();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
// 일반적인 clone 메소드는 얕은 복사(shallow copy) 이다.
// 참조 값을 복사하는 것 , 인스턴스 자체를 복사하지 않음