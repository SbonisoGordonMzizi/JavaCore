import java.time.*;

public class  date_time {
    public static void main(String[] args){
        LocalDate nowDate = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        LocalDateTime nowDateTime = LocalDateTime.of(nowDate,nowTime);
        System.out.println(nowDateTime);
    }
}