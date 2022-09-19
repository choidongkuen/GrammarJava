// String 은 변경 불가능한 자료형이다.
// 우리가 깊은 복사를 고려하는 이유는 얕은 복사는 값이 같이 변경(동기화)되기 때문이다.
// 그러나 String 은 이럴 걱정이 없음으로, 깊은 복사를 고려할 필요가 없다.

package 오브젝트;

class Person implements Cloneable{

    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void changeName(String name){
        this.name = name;
    }
    public void showPersonInfo(){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println();
    }

    protected Object getclone() throws CloneNotSupportedException{
        Person cpy = (Person)super.clone();
        return cpy;
    }
}
public class Object07 {
    public static void main(String[] args) {
        try{
            Person p1 = new Person("이승원",22);
            Person p2 = (Person)p1.getclone();
            p2.changeName("최동근"); // 새로운 문자열로 대체

            Person p3 = (Person)p2.getclone();
            p3.changeName("정승주");

//            Person p4 = (Person)p2.clone(); -> 불가

            p1.showPersonInfo(); // 이승원 22
            p2.showPersonInfo(); // 최동근 22
            p3.showPersonInfo(); // 정승주 22
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
