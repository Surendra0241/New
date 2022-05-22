package pract;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
	public static String date() {
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yy hh-mm-ss");     //format the date and time as required
    LocalDateTime now= LocalDateTime.now();
    String d= dtf.format(now);
    return d;
}
}