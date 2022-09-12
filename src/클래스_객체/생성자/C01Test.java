package 클래스_객체.생성자;

public class C01Test {
    public static void main(String[] args) {

        C01 inst1 = new C01(); // 기본 생성자(만들지 않아도 제공)
        C01 inst2 = new C01("최동근", 26, "M");
        C01 inst3 = new C01("박무지", 27, "G", "컴퓨터 공학과", 201904536);

    }
}
