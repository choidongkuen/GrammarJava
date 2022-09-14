package 오버라이딩.개인정보관리프로그램;

public class HighFriend extends Friend{

    String work; // 직장

    public HighFriend(String name, String phoneNum, String addr, String work){
        super(name,phoneNum,addr); // 상위 클래스의 생성자 호출 및 실행
        this.work = work;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("work = " + work);
    }

    @Override
    public void showSimpleData() {
        System.out.println("name = " + name);
        System.out.println("phoneNum = " + phoneNum);
    }
}
