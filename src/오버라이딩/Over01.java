// 하위 클래스의 인스턴스 생성시 항상, 상위 클래스의 필드 및 메서드가 먼저 메모리에 생성된다 !!!
// computer <- NoteBookComp <- TabletNoteBook # 상속 관계
// 상속 관계는 IS-A 관계 !! ex) 노트북은 컴퓨터이다.


package 오버라이딩;

class Computer{
    String owner; // 컴퓨터의 소유주

    public Computer(String owner){this.owner = owner;}
    public void calculate(){
        System.out.println("요청 내용을 계산합니다.");
    }
}

class NoteBookComp extends Computer {

    int battery; // 노트북의 배터리 양

    public NoteBookComp(String owner, int battery) {
        super(owner); // 상위 클래스의 생성자 호출
        this.battery = battery;
    }

    public void charging() {
        if (this.battery + 5 > 100) {
            battery = 100;
        } // 100초과하는 이슈

        battery += 5;
    }

    public void movingCal() {
        if (battery < 1) {
            System.out.println("배터리가 부족해 계산할 수 없습니다.");
            return;
        }
        System.out.print("이동하면서 ");
        calculate(); // 상위 클래스의 메소드
        battery -= 1; // 배터리 감소
        }
    }


    class TabletNoteBook extends NoteBookComp {
        String regstPenModel; // 테블릿 pc 의 펜 모델 이름

        TabletNoteBook(String owner, int battery, String regstPenModel) {
            super(owner, battery);
            this.regstPenModel = regstPenModel;
        }

        public void write(String penInfo) {

            if (this.battery < 1) {
                System.out.println("배터리가 부족해 펜을 이용할 수 없습니다.");
                return;
            }
            if (this.regstPenModel.compareTo(penInfo) != 0) {
                System.out.println("펜의 정보가 맞지 않습니다.");
            }

            System.out.println("필기 내용을 처리합니다.");
            battery -= 1;
        }
    }

    public class Over01 {
        public static void main(String[] args) {
            NoteBookComp nbc = new NoteBookComp("최동근", 100);
            TabletNoteBook tnb = new TabletNoteBook("최동근", 95, "애플펜슬");

            nbc.movingCal();
            tnb.write("삼성펜슬");
        }

    }

