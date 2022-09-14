package 오버라이딩.개인정보관리프로그램;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num; // 친구 수
        System.out.print("Enter Counts : ");
        num = sc.nextInt(); // 친구 수 입력
        FriendInfoHandler manager = new FriendInfoHandler(num); // control 클래스 인스턴스 생성

        while(true){
            System.out.println(" == Option == ");
            System.out.println("1. 고교 친구 저장");
            System.out.println("2. 대학 친구 저장");
            System.out.println("3. 전체 정보 출력");
            System.out.println("4. 기본 정보 출력");
            System.out.println("5. 프로그램 종료");

            System.out.print("Enter : ");
            int choice = sc.nextInt(); // 선택안 입력

            switch(choice){

                case 1: case 2:
                    manager.addFriend(choice);
                    break;
                case 3:
                    manager.showAllData();
                    break;
                case 4:
                    manager.showAllSimpleData();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return; // main 함수 종료
            }
        }
    }
}
