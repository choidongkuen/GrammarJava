// 쓰레드 동기화란 하나의 자원의 두개 이상의 쓰레드(실행 흐름) 이 접근하는 것을 막는 기법이지만, 각 쓰레드의 '접근 순서를 컨트롤' 하는 것도 동기화에 범주에 속한다.

package 쓰레드;


class NewsPaper{
    String todayNews;

    public /*synchronized*/ void setTodayNews(String news){
        this.todayNews = news;
    } // todayNews 설정하는 메소드

    public /*synchronized*/ String getTodayNews(){
        return this.todayNews;
    } // todayNews를 get 하는 메소드
}

class NewsWriter extends Thread{ // 해당 클래스를 쓰레드로 작동시키겠다.

    NewsPaper news = new NewsPaper();

    public NewsWriter(NewsPaper news){
        this.news = news;
    }

    public void run(){

        news.setTodayNews("자바의 인기는 높습니다.");
    }
}

class NewsReader extends Thread{ // 해당 클래스를 쓰레드로 작동시키겠다.

    NewsPaper news = new NewsPaper(); // NewsPaper 인스턴스 생성

    public NewsReader(NewsPaper news){
        this.news = news;
    }

    public void run(){

        System.out.println("오늘의 뉴스 : " + news.getTodayNews());
    }
}
public class Th10 {

    public static void main(String[] args) {

        NewsPaper np = new NewsPaper();

        NewsReader reader = new NewsReader(np); // 데이터를 가져다 놓는 쓰레드 (setTodayNews)
        NewsWriter writer = new NewsWriter(np); // 데이터를 가져다 쓰는 쓰레드 (getTodayNews)

        reader.start();
        writer.start();

        try{
            reader.join();
            writer.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

// getTodayNews 가 setTodayNews보다 먼저 실행되고 있어 문제가 생김.
// 쓰레드의 실행 순서는 소스코드가 나열된 순서와 다를 수 있다! 즉, 단지 코드 순서만 바꾼다고 쓰레드의 순서를 보장 할 수 있는 것은 아니다.
// 54,55 행의 순서를 바꾸는 것은 해결책 x

// 쓰레드의 실행 순서를 컨트롤 하는 법 : wait,notify,notifyAll 메소드 이용하자.