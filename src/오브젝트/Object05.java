// clone 메소드를 사용하기 위해서는 해당 클래스가 Cloneable 인터페이스를 구현해야 한다.
// 인스턴스의 복사는 매우 민감한 작업이다.
// Cloneable 인터페이스는 텅 비어있는 인터페이스이다.
// Cloneable 인터페이스 구현 및 오버라이딩

package 오브젝트;

class Points implements Cloneable{
    private int xPos;
    private int yPos;

    public Points(int x, int y){
        this.xPos = x;
        this.yPos = y;
    }

    public void showPosition(){
        System.out.printf("[%d %d]",this.xPos,this.yPos);
        System.out.println("");
    }

    public Object clone() throws CloneNotSupportedException{ // 예외 상황이 발생할 수 있는 여지 처리를 넘긴다.
        return super.clone();
    } // 메소드 오바리이딩 -> protected 접근제어 지시자는 다른 패키지에 상속받는 자식 클래스도 접근 가능
}
public class Object05 {
    public static void main(String[] args) {
        Points org = new Points(3,5);
        Points cpy;

        try{
            cpy = (Points)org.clone();
            org.showPosition();
            cpy.showPosition();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
