package stu.gu.dc;

import java.util.ArrayList;
import java.util.List;

public class DistanceCalculation {

	private static final double R_KM = 6371.01;

	public static double calculateDistanceByCoordinates(double lat1, double lon1, double lat2, double lon2) {

		if ((lat1 == lat2) && (lon1 == lon2)) {
			return 0;
		}

		double theta;
		double dist;
		theta = lon1 - lon2;

		dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));

		dist = R_KM * Math.acos(dist);

		return dist;
	}

	private static double deg2rad(double deg) {

		return (deg * Math.PI / 180);
	}

//	// converts radians to decimal degrees
//
//	private static double rad2deg(double rad) {
//
//		return (rad * 180 / Math.PI);
//	}

	public static void main(String[] args) {
		GeoLocation home=new GeoLocation(43.416526,-80.321309);
		
		List<GeoLocation> inst= new ArrayList<GeoLocation>();
		
		inst.add(new GeoLocation(	 43.53724,-80.167816		));
		inst.add(new GeoLocation(	 43.53724,-80.167816		));
		inst.add(new GeoLocation(	43.578545,-80.142166		));
		inst.add(new GeoLocation(	43.578545,-80.142166		));
		inst.add(new GeoLocation(	43.628367,-80.084923		));
		inst.add(new GeoLocation(	43.628367,-80.084923		));
		inst.add(new GeoLocation(	43.657554 ,-80.33027		));
		inst.add(new GeoLocation(	43.657554 ,-80.33027		));
		inst.add(new GeoLocation(	43.667105,-80.286698		));
		inst.add(new GeoLocation(	43.667105,-80.286698		));
		inst.add(new GeoLocation(	43.723818,-80.342403		));
		inst.add(new GeoLocation(	43.723818,-80.342403		));
		inst.add(new GeoLocation(	43.739459,-80.364893		));
		inst.add(new GeoLocation(	43.739459,-80.364893		));
		inst.add(new GeoLocation(	43.742899,-80.125522		));
		inst.add(new GeoLocation(	43.742899,-80.125522		));
		inst.add(new GeoLocation(	43.747577,-80.080909		));
		inst.add(new GeoLocation(	43.747577,-80.080909		));
		inst.add(new GeoLocation(	 43.76968,-80.163941		));
		inst.add(new GeoLocation(	 43.76968,-80.163941		));
		inst.add(new GeoLocation(	43.771104,-80.289509		));
		inst.add(new GeoLocation(	43.771104,-80.289509		));
		inst.add(new GeoLocation(	43.780738 ,-80.27887		));
		inst.add(new GeoLocation(	43.780738 ,-80.27887		));
		inst.add(new GeoLocation(	43.782587,-80.226982		));
		inst.add(new GeoLocation(	43.782587,-80.226982		));
		inst.add(new GeoLocation(	43.559895,-80.034667		));
		inst.add(new GeoLocation(	43.559895,-80.034667		));
		inst.add(new GeoLocation(	43.621509,-80.144403		));
		inst.add(new GeoLocation(	43.621509,-80.144403		));
		inst.add(new GeoLocation(	 43.63119,-80.257869		));
		inst.add(new GeoLocation(	 43.63119,-80.257869		));
		inst.add(new GeoLocation(	43.663861,-80.155367		));
		inst.add(new GeoLocation(	43.663861,-80.155367		));
		inst.add(new GeoLocation(	43.687918,-80.266003		));
		inst.add(new GeoLocation(	43.687918,-80.266003		));
		inst.add(new GeoLocation(	43.726271,-80.271855		));
		inst.add(new GeoLocation(	43.726271,-80.271855		));
		inst.add(new GeoLocation(	43.742686,-80.223179		));
		inst.add(new GeoLocation(	43.742686,-80.223179		));
		inst.add(new GeoLocation(	43.750259,-80.357386		));
		inst.add(new GeoLocation(	43.750259,-80.357386		));
		inst.add(new GeoLocation(	 43.77166,-80.142132		));
		inst.add(new GeoLocation(	 43.77166,-80.142132		));
		inst.add(new GeoLocation(	43.535802 ,-80.16861		));
		inst.add(new GeoLocation(	43.535802 ,-80.16861		));
		inst.add(new GeoLocation(	 43.58775,-80.258598		));
		inst.add(new GeoLocation(	 43.58775,-80.258598		));
		inst.add(new GeoLocation(	43.638762,-80.196668		));
		inst.add(new GeoLocation(	43.638762,-80.196668		));
		inst.add(new GeoLocation(	43.657179,-80.054933		));
		inst.add(new GeoLocation(	43.657179,-80.054933		));
		inst.add(new GeoLocation(	43.551136,-80.213945		));
		inst.add(new GeoLocation(	43.551136,-80.213945		));
		inst.add(new GeoLocation(	 43.61924,-80.096245		));
		inst.add(new GeoLocation(	 43.61924,-80.096245		));
		inst.add(new GeoLocation(	43.648474,-80.186268		));
		inst.add(new GeoLocation(	43.648474,-80.186268		));
		inst.add(new GeoLocation(	43.658966,-80.249106		));
		inst.add(new GeoLocation(	43.658966,-80.249106		));
		inst.add(new GeoLocation(	43.696918,-80.254809		));
		inst.add(new GeoLocation(	43.696918,-80.254809		));
		inst.add(new GeoLocation(	43.701711,-80.362803		));
		inst.add(new GeoLocation(	43.701711,-80.362803		));
		inst.add(new GeoLocation(	43.761368,-80.325042		));
		inst.add(new GeoLocation(	43.761368,-80.325042		));
		inst.add(new GeoLocation(	43.769712,-80.343813		));
		inst.add(new GeoLocation(	43.769712,-80.343813		));
		inst.add(new GeoLocation(	43.794077,-80.322534		));
		inst.add(new GeoLocation(	43.794077,-80.322534		));
		inst.add(new GeoLocation(	43.698354,-80.133314		));
		inst.add(new GeoLocation(	43.698354,-80.133314		));
		inst.add(new GeoLocation(	43.756314,-80.067802		));
		inst.add(new GeoLocation(	43.756314,-80.067802		));
		inst.add(new GeoLocation(	43.793239,-80.141817		));
		inst.add(new GeoLocation(	43.793239,-80.141817		));
		inst.add(new GeoLocation(	 43.66425 ,-80.15812		));
		inst.add(new GeoLocation(	 43.66425 ,-80.15812		));
		inst.add(new GeoLocation(	43.621608,-80.148227		));
		inst.add(new GeoLocation(	43.621608,-80.148227		));
		inst.add(new GeoLocation(	43.607704,-80.133477		));
		inst.add(new GeoLocation(	43.607704,-80.133477		));
		
		for (int i=0;i<inst.size();i++)
		{
			System.out.println(String.valueOf(calculateDistanceByCoordinates(home.latitude,home.longitude,inst.get(i).latitude,inst.get(i).longitude)));
		}

	}

	private static class GeoLocation {
		private double latitude;
		private double longitude;

		public GeoLocation(double latitude, double longitude) {
			super();
			this.latitude = latitude;
			this.longitude = longitude;
		}

		public double getLatitude() {
			return this.latitude;
		}

		public double getLongitude() {
			return this.longitude;
		}
	}

}
