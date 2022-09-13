package 날짜클래스;

import java.lang.ref.Cleaner;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


public class Cal01  {
    public static void main(String[] args) {

        Date today = Calendar.getInstance().getTime();
//        int year = Calendar.getInstance().get(Calendar.YEAR);

//        System.out.println(year);

//        System.out.println(today);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss"); // 클래스 선언
//        System.out.println(simpleDateFormat.format(today));
        LocalDate localDate = LocalDate.now(); // 날짜
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now(); // 시간
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now(); // 시간 & 날짜
        System.out.println(localDateTime);


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(localDateTime.format(dateTimeFormatter)); // simpleDataFormat이랑은 다르다.


        System.out.println(localDateTime.plusYears(1).plusMonths(1).plusDays(100).format(dateTimeFormatter)); // 현재 날짜 계산




    }
}
