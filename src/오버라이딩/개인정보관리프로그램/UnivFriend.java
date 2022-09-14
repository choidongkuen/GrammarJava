package 오버라이딩.개인정보관리프로그램;

public class UnivFriend extends Friend {

    String major; // 전공

    public UnivFriend(String name, String phoneNum, String addr, String major){
        super(name,phoneNum,addr); // 상위 클래스의 생성자 호출 및 생성
        this.major = major;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("major = " + major);
    }

    @Override
    public void showSimpleData() {
        System.out.println("name = " + name);
        System.out.println("phoneNum = " + phoneNum);
        System.out.println("major = " + major);
    }
}
