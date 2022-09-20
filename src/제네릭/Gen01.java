// 제네릭에 필요성 : 특정 클래스의 매개변수를 Object 으로 설정시, 이에 대한 데이터를 다룰때마다, 형변환이 필요하다.

package 제네릭;

public class Gen01 {
    public static void main(String[] args) {
        Box01<String> box1 = new Box01<String>(); // 객체 생성시 데이터 타입 결정
        box1.setBox("최동근");
        String name = box1.getBox();
        System.out.println("name = " + name);


        Box01<Integer> box2 = new Box01<Integer>();
        box2.setBox(26);
        Integer age = box2.getBox();
        System.out.println("age = " + age);

        // 형변환이 필요가 없음(Object 사용할 필요도 없음)
    }
}
