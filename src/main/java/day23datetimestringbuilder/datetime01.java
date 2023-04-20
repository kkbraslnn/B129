package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class datetime01 {

    public static void main(String[] args) {

        // Example 1: Time'i formatlayiniz
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime); //10:14:48.132115300

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(dtf.format(myTime)); // 10:16:17 AM











    }
}