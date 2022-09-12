package 상속;

public class IH05 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Human h1 = new Human();
        s1.name = "Choi";

        System.out.println(h1.name);
    }
}

class Student extends Human{

}

class Human{
    public String name;

}