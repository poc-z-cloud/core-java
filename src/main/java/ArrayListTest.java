import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> ar= new ArrayList(Arrays.asList("One", "Two", "Three"));
		
		
		
		System.out.println(ar.subList(0, ar.size()));

	}

}
