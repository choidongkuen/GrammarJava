package 제네릭;

public class Gen02 {
    public static void main(String[] args) {

        Box02<String> b1 = new Box02<String>();
        
        b1.setData("최동근","남자");
        
        String name = b1.getData();
        String gender = b1.getLastData();

        System.out.println("name = " + name);
        System.out.println("gender = " + gender);

    }
}
