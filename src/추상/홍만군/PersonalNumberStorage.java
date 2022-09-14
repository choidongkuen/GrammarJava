// 홍만군은 A사에게 addPersonalInfo 메소드와 searchName 메소드를 의뢰한 것이며, 둘 사이에 명확한 약속이 필요했다. 또한 하나의 클래스로 통제를 원했다.
// 즉, interface PersonalNumberStorage 를 미리 만들고, A 사로 하여금 이를 구현하도록 하면 된다.
// 그 후, 상속과 메소드 오버라이딩 원리로 하나의 인스턴스로 컨트롤하면 된다.

package 추상.홍만군;

public interface PersonalNumberStorage {
    public abstract void addPersonalInfo(String name, String perNum);
    public abstract String searchName(String perNum);
}

class PersonalNumInfo{ // 해당 클래스에 대한 인스턴스 배열을 만들어서 관리하자.

    private String name;
    private String number;

    PersonalNumInfo(String name, String number){
        this.name = name;
        this.number = number;
    }

    String getName(){return this.name;}
    String getPerNum(){return this.number;}
}

class PersonalNumberStorageImp implements PersonalNumberStorage{ // 해당 클래스에 addPersonalInfo,SearchName 메소드를 구현하자.

    PersonalNumInfo[] perArr; // 사람들의 정보에 대한 인스턴스 배열
    int numOfPerson;

    public PersonalNumberStorageImp(int num){
        perArr = new PersonalNumInfo[num];
        numOfPerson = 0;
    }

    @Override
    public void addPersonalInfo(String name, String perNum) {
        perArr[numOfPerson ++] = new PersonalNumInfo(name,perNum);
    }

    @Override
    public String searchName(String perNum) {

        for (int i = 0; i < numOfPerson; i++) {
            if(perArr[i].getPerNum().compareTo(perNum) == 0)
                return perArr[i].getName();
        }
        return null; // 해당 주민번호를 가지는 사람이 존재하지 않으면
    }
}



