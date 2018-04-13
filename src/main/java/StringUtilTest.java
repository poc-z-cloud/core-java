import org.apache.commons.lang3.StringUtils;

public class StringUtilTest {
	private static String trim0(String str) {
		if (str==null) return str;
		return Integer.valueOf(str).toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println(StringUtil.isInteger(null));
//		System.out.println(StringUtil.isInteger(""));
//		System.out.println(StringUtil.isInteger("123.45"));
//		System.out.println(StringUtil.isInteger("123.45l"));
//		System.out.println(StringUtil.isInteger("-123"));
//		System.out.println(StringUtil.isInteger("123"));

		
//		System.out.println(StringUtilTest.trim0("01"));

		System.out.println(StringUtils.stripStart(null,"0"));
		System.out.println(StringUtils.stripStart("","0"));
		System.out.println(StringUtils.stripStart("0","0"));
		System.out.println(StringUtils.stripStart("012","0"));
		System.out.println(StringUtils.stripStart("00120","0"));
	}

}
