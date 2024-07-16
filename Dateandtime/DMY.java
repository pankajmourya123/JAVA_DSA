package Dateandtime;

import java.time.LocalDate;
import java.time.LocalTime;

public class DMY {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        // System.out.println(date);
        LocalTime time = LocalTime.now();
        // System.out.println(time);
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yy = date.getYear();
        int h = time.getHour();
        int m = time.getMinute();
        int s = time.getSecond();
        int n = time.getNano();
        // System.out.println(dd + "..." + mm + "..." + yy);
        System.out.printf("\n%d-%d-%d", dd, mm, yy);
        System.out.printf("\n%d:%d:%d:%d",h,m,s,n);  
    }
}
