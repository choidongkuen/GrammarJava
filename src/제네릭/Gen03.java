package 제네릭;

public class Gen03 {
    public static void main(String[] args) {

        Box03<String,Integer> box3 = new Box03<String,Integer>();
        box3.setData("최동근",26);

        String name = box3.getName();
        Integer age = box3.getAge();

        System.out.println("this.name = " + name);
        System.out.println("this.age = " + age);
    }
}
