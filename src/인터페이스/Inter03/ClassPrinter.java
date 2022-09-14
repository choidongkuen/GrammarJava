// System.out.println(Object obj) 는 해당 인스턴스의 toString 메소드 호출 !!

package 인터페이스.Inter03;

interface UpperCasePrintable{

} // 비어있는 인터페이스

public class ClassPrinter {
    public static void print(Object obj){ // 정적 메소드
        String org = obj.toString(); // 실제 인스턴스의 toString() 메소드 호출 # 메소드 오버라이딩
        if(obj instanceof UpperCasePrintable) // UpperCasePrintable 로 형변환 가능하니? (Point(obj)) 일때, 가능
            org = org.toUpperCase();

        System.out.println(org);

//        System.out.println(obj.toString()); // obj에 위치하는 인스턴스의 toString 메서드 호출

    }
}

class Point implements UpperCasePrintable{ // 해당 인터페이스를 구현(상속)
    private int xPos,yPos;

    Point(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }
    public String toString(){
        String posInfo = "[ x : " + this.xPos + ", y : " + this.yPos + " ]";
        return posInfo;
    }
}

class ImplObjectPrintln{
    public static void main(String[] args) {
        Point p1 = new Point(10,20);
        Point p2 = new Point(12,8);
        ClassPrinter.print(p1);
        ClassPrinter.print(p2);
    }
}
