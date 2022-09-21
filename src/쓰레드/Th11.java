// wait,notify,notifyAll 메소드는 모두 Object 클래스에 정의된 메소드이다.
// Th10에 해당 함수를 적용해보자.

package 쓰레드;

class NewsPaperCompany{
    String todayNews;
    boolean isTodayNews = false;

    public void setTodayNews(String news){
        this.todayNews = news;
        isTodayNews = true;

        synchronized (this){
            notifyAll(); // 설정했으니, 모두 일어나세요~
        }
    }

    public String getTodayNews(){

        if(!this.isTodayNews){

            try{
                synchronized (this){
                    wait(); // 없으니, 기다릴깨요.
                }
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        return this.todayNews;
    }
}

class NewsWriterClass extends Thread{

    NewsPaperCompany com;

    public NewsWriterClass(NewsPaperCompany com){
        this.com = com;
    }
    public void run(){
        com.setTodayNews("자바 좋아요 ~");
    }
}

class NewsReaderClass extends Thread{

    NewsPaperCompany com;

    public NewsReaderClass(NewsPaperCompany com){
        this.com = com;
    }

    public void run(){
        System.out.println("오늘의 뉴스 : " + com.getTodayNews());
    }
}

public class Th11 {

    public static void main(String[] args) {

        NewsPaperCompany newsPaperCompany = new NewsPaperCompany();

        NewsWriterClass writer = new NewsWriterClass(newsPaperCompany);
        NewsReaderClass reader1 = new NewsReaderClass(newsPaperCompany);
        NewsReaderClass reader2 = new NewsReaderClass(newsPaperCompany);

        try {
            reader1.start();
            reader2.start(); // 두 리더가 오늘의 뉴스를 읽음

            Thread.sleep(1000);
            writer.start(); // 뉴스 기고가가 뉴스를 작성

            reader1.join();
            reader2.join();
            writer.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
