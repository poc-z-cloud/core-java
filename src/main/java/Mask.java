
public class Mask {

	public static String maskSin(String sin) {
			String last3Digit = sin.substring(6);
			String mask = "******";
			String maskedSin = mask.concat(last3Digit);
			return maskedSin;

	}
	
	public static void main(String[] args)
	{
		System.out.println(maskSin("123456789"));
		System.out.println(maskSin("123456**"));
		System.out.println(maskSin("123456"));
		System.out.println(maskSin("12345"));
	}

}
