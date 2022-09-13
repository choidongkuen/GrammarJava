// 문자열(String)은 불변의 reference data type 이다.
// 문자열을 변경할 경우 이는 기존 메모리 주소를 유지하는 것이 아니라, 새로운 메모리 주소를 기존의 참조 변수가 가리키게 된다.
// 이는 메모리상에 많은 부담을 줄 수 있다.(but, 요즘 컴파일러는 성능이 매우 좋아서, 별 차이 없음 for 가독성)
// StringBuffer, StringBuilder는 가변의 문자열이다.

package 스트링.StringBufferTest;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); // 스트링버퍼 인스턴스 생성
        StringBuilder sb2 = new StringBuilder(); // 스트링빌더 인스턴스 생성


        String name = "최동근";
        int age = 26;
        String schoolName = "한국외국어대학교";
        String department = "컴퓨터 공학부";
        String family = "아들";
        String addr = "시흥시 배곧 1로";
        String student = "학생";
        String phoneNum = "01090176902";
        String job = "개발자";

        /*
        sb.append(String.format("이름 : %s",name));
        sb.append(System.lineSeparator()); // System.lineSeperator() -> 줄바꿈
        sb.append(String.format("학생 : %s",student));
        sb.append(System.lineSeparator());
        sb.append(String.format("나이 : %d",age));
        sb.append(System.lineSeparator());
        sb.append(String.format("학교 : %s",schoolName));
        sb.append(System.lineSeparator());
        sb.append(String.format("학과 : %s",department));
        System.out.println(sb);

        System.out.println("--------------------");
        sb2.append(String.format("이름 : %s",name));
        sb2.append(System.lineSeparator());
        sb2.append("아들");
        sb2.append(System.lineSeparator());
        sb2.append(String.format("나이 : %d",age)).append(System.lineSeparator()).append(String.format("주소 : %s",addr));
        sb2.append(System.lineSeparator());
        sb2.append(String.format("핸드폰: %s",phoneNum));
        System.out.println(sb2);
         */

        // appendLine(); -> 줄 띄우고 문자열 덧셈
        // appendFormat(); -> 포맷팅하기

        StringPlus sp = new StringPlus();
        //sp.append(String.format("이름 : %s",name));
        sp.appendFormat("이름: %s", name).line().appendFormat("직업: %s",job)
                        .line().appendFormat("나이 : %d",age);


        System.out.println(sp);





    }
}
