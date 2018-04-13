


public class Child extends Parent{

	
	public String getClassName(){
		return this.getClass().getName();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Parent p = new Child();
//		System.out.println(p.getClassName());
//		
//
//		Parent c = new Child();
//		System.out.println(c.getClassName());
//
//		for (int i=1516;i<=1415;i=i+101){
//			System.out.println(i);
//		}

//		int iBaseYearMinus2= Integer.parseInt("1516")/100+2000-2;
//		
//		System.out.println(iBaseYearMinus2);
		
		Child obj= new Child();
		

		System.out.println(obj.yearCode2AcademicYear("1516"));
		System.out.println(obj.academicYear2YearCode("2015"));
	}
	
	private String yearCode2AcademicYear(String yearCode){
		if (yearCode!=null){
			return String.valueOf(Integer.parseInt(yearCode)/100+2000);
		}
		return null;
	}
	
	private String academicYear2YearCode(String academicYear){
		if (academicYear!=null){
			int lowYear=Integer.parseInt(academicYear) % 100;
			return String.valueOf(lowYear*101+1);
		}
		return null;
	}
	


}
