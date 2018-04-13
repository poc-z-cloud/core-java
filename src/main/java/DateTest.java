import java.util.Date;


public class DateTest {

	public static boolean isWithinTwoYears(Date later, Date earlier) {
		boolean result = false;
		if (later != null && earlier != null) {
			long diffInMiliSec = 2 * 365 * 24 * 60 * 60 * 1000L;
			if ((later.getTime() - earlier.getTime()) <= diffInMiliSec) {
				result = true;
			}
		}
		return result;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isWithinTwoYears(new Date(),null));

	}

}
