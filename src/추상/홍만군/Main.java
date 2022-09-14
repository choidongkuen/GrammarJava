package 추상.홍만군;

public class Main {
    public static void main(String[] args) {

        PersonalNumberStorage storage = new PersonalNumberStorageImp(100); // 100명의 사람을 저장 할 수 있는 저장소
        storage.addPersonalInfo("최동근","971201");
        storage.addPersonalInfo("박건구","970129");

        System.out.println(storage.searchName("971201"));
    }
}
