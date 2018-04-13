import java.util.ArrayList;
import java.util.List;


public class AcademicYear {
	public List<String> getAffectedAcademicYears(int taxYear) {
		List<String> academicYears = new ArrayList<String>();
		
		if (taxYear<2014) return academicYears;
		
		if (taxYear == 2014){
			academicYears.add("1516");
		}else{
			academicYears.add(String.valueOf(taxYear % 100) + (String.valueOf((taxYear+1) % 100)));
			academicYears.add(String.valueOf((taxYear+1) % 100) + (String.valueOf((taxYear+2) % 100)));
		}
		
		return academicYears;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AcademicYear obj = new AcademicYear();

		for (int i=2014;i<2020;i++){
			System.out.print("taxYear:" + i);
			List<String> academicYears =obj.getAffectedAcademicYears(i);
			
			for (String str: academicYears){
				System.out.print(" academicYear:" + str);
				
			}
			System.out.println();
		}

	}

}
