import java.util.HashMap;


public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> map= new HashMap<String,String>();
		map.put("A", "a");
		map.put("B", null);
		
		System.out.println(map.get("A"));
		System.out.println(map.get("B"));
		System.out.println(map.get("C"));
		System.out.println(map.get(null));
		
	}

}
