package stu.gu.dc;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTest {
	public static Integer formatMMddToYYYYMMdd(String monthYear) {

		if (monthYear == null || monthYear.length() != 4) {
			return 0;
		}

		Calendar calendar = Calendar.getInstance();

		SimpleDateFormat sdf = new SimpleDateFormat("yy");
		int currentYear = Integer.valueOf(sdf.format(calendar.getTime()));

		int month = Integer.valueOf(monthYear.substring(0, 2));
		int year = Integer.valueOf(monthYear.substring(2, 4));

		if (year <= currentYear) {
			year = 2000 + year;
		} else {
			year = 1900 + year;
		}

		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month - 1); // month starts with 0
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

		sdf = new SimpleDateFormat("yyyyMMdd");
		String dt = sdf.format(calendar.getTime());

		return Integer.valueOf(dt);
	}
	
	public static void main(String[] args){
		System.out.println(formatMMddToYYYYMMdd("0212"));
	}

}
