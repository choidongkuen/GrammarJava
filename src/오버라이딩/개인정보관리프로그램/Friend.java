package 오버라이딩.개인정보관리프로그램;

public abstract class Friend { // 최상위 클래스
    String name;
    String phoneNum;
    String addr;

    public Friend(String name, String phoneNum, String addr){
        this.name = name;
        this.phoneNum = phoneNum;
        this.addr = addr;
    }

    public void showData(){ // 기본정보를 출력하는 메서드(이름,전화번호,주소)
        System.out.println("name = " + name);
        System.out.println("phoneNum = " + phoneNum);
        System.out.println("addr = " + addr);
    }

    public abstract void showSimpleData();// 기본정보를 출력하는 메서드 -> 추상메서드는 아니다.
}
