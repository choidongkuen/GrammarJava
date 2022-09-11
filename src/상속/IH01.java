package 상속;

class Man{
    private String name; // 인스턴스 변수
    public Man(String name){ // Man 클래스의 생성자
        this.name  = name;
    }
    public void tellYourName(){ // 메서드 1
        System.out.println("My name is + "+name);
    }
}
class BusinessMan extends Man{
    private String position;
    private String company; // 인스턴스 변수
    public BusinessMan(String name, String position,String company){ // BusinessMan의 생성자
        super(name); // 상위 클래스 생성자 호출
        this.position = position;
        this.company = company;
    }
    public void tellYourInfo(){
        System.out.println("My company is "+this.company);
        System.out.println("My position is "+this.position);
        tellYourName(); // 상위 클래스의 메서드
    }
}
public class IH01{
    public static void main(){
        BusinessMan bm1 = new BusinessMan("Mr.Hong","CEO","SAMSUNG"); // 첫번째 인스턴스
        BusinessMan bm2 = new BusinessMan("Mr.Choi","Staff","LG"); // 두번째 인스턴스

        System.out.println("=== first man info ===");
        bm1.tellYourInfo();

        System.out.println("=== second man info ===");
        bm2.tellYourInfo();
    }
}