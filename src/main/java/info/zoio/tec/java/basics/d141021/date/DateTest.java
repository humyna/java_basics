package info.zoio.tec.java.basics.d141021.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 与日期相关的类：Date与Calendar
 *
 * @author humyna
 *
 */
public class DateTest {
	public static void main(String[] args) throws ParseException {
		dateTest1();
		System.out.println();

		dateTest2();
		System.out.println();

		dateTest3();
	}

	private static void dateTest1() throws ParseException{
		Date date = new Date();
		System.out.println(date);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));

		String dateStr = "2014-10-21";
		System.out.println(sdf.parseObject(dateStr));
	}

	@Deprecated
	private static void dateTest2(){
		Date date = new Date();
		System.out.println("Day:" + date.getDay());
		System.out.println("Year:" + date.getYear());
		System.out.println("Month:" + date.getMonth());
		System.out.println("Date:" + date.getDate());
		System.out.println("Hours:" + date.getHours());
		System.out.println("Minutes:" + date.getMinutes());
		System.out.println("Seconds:" + date.getSeconds());
		System.out.println("Time:" + date.getTime());
		System.out.println("TimezoneOffset:" + date.getTimezoneOffset());
	}

	private static void dateTest3(){
		Calendar calendar = Calendar.getInstance();
		 System.out.println("Time:" + calendar.getTime());
		 System.out.println("TimeZone:" + calendar.getTimeZone());
		 System.out.println("Year:" + calendar.get(Calendar.YEAR));
		 System.out.println("Month:" + calendar.get(Calendar.MONTH));
		 System.out.println("Day:" + calendar.get(Calendar.DATE));
		 System.out.println("Hour:" + calendar.get(Calendar.HOUR));
		 System.out.println("HourOfDay:" + calendar.get(Calendar.HOUR_OF_DAY));
		 System.out.println("Minute:" + calendar.get(Calendar.MINUTE));
		 System.out.println("Second:" + calendar.get(Calendar.SECOND));
		 System.out.println("DayOfWeek:" + calendar.get(Calendar.DAY_OF_WEEK));
		 System.out.println("DayOfMonth:" + calendar.get(Calendar.DAY_OF_MONTH));
		 System.out.println("DayOfYear:" + calendar.get(Calendar.DAY_OF_YEAR));
	}
}
