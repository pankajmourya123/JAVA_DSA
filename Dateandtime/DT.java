package Dateandtime;

import java.time.LocalDateTime;
import java.time.Month;

public class DT {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); 
System.out.println(dt);

LocalDateTime dt1 = LocalDateTime.of(1995,Month.APRIL,28,12,45); 
        System.out.println(dt1); 
    }
}
