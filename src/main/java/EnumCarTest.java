
public class EnumCarTest {

	public static void main(String[] args) {
		EnumCar car1= EnumCar.Audi;
		EnumCar car2= EnumCar.Audi;

		car1.setDriver("Jason");
		
		System.out.println("car2 driver: " + car2.getDriver());
	}

}
