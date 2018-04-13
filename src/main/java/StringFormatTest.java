import java.util.Date;


public class StringFormatTest {
	private String toPadString(Integer theInt) {
		if (theInt==null) return null;
		
		return String.format("%09d", theInt);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today= new Date();
		String key =String.format("%d_%tY%tm%td_%s",123456789012345L, today,today,today,"5");
	
		System.out.println("Key:"+key);
		
		System.out.println(String.format("%09d", 1234));
		
		System.out.println(String.format("%09", "12345"));

	}

}
