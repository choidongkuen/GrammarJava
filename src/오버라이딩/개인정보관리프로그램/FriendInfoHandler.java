// 기본적으로 control class 가 있어야 좋은 설계이다.

package 오버라이딩.개인정보관리프로그램;

import java.util.Scanner;

public class FriendInfoHandler {

    private Friend[] myFriends; // Friend 인스턴스 배열 선언
    private int numOfFriends; // 저장되는 친구 수

    public FriendInfoHandler(int num){
        myFriends = new Friend[num]; // 인스턴스 배열 정의
        numOfFriends = 0;
    }

    private void addFriendInfo(Friend fren){ // 외부에서 접근 불가, only 내부에서만 .. call by addFriend 메소드
        myFriends[numOfFriends ++] = fren;
    }

    public void addFriend(int choice){
        String name,phoneNum,addr,work,major;

        Scanner sc = new Scanner(System.in);
        System.out.print("name : "); name = sc.next(); // 이름 입력
        System.out.print("phoneNum : ");phoneNum = sc.next(); // 전화번호 입력
        System.out.println("address : ");addr = sc.next(); // 주소 입력

        if(choice == 1) { // 고등학교 친구
            System.out.print("work : ");
            work = sc.next(); // 직업 입력
            addFriendInfo(new HighFriend(name, phoneNum, addr, work));
        }else{ // 대학 친구
            System.out.print("major : ");
            major = sc.next();
            addFriendInfo(new UnivFriend(name,phoneNum,addr,major));
        }

        System.out.println("추가 완료!");
        System.lineSeparator();
    }

    public void showAllData(){
        for(Friend f : myFriends)
            f.showData(); // 각 하위클래스의 오버라이딩된 메서드 호출(showData())
    }

    public void showAllSimpleData(){
        for(Friend f : myFriends)
            f.showSimpleData(); // 각 하위클래스의 오버라이딩된 메서드 호출(showSimpleData()) -> Friend 에서 구현부를 빈 상태로 무리하게 메소드 호출한 이유 !!
    }
}
