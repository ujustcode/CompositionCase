package Atmospehere.AeroSpace;

import Atmosphere.FlyingVehicles.Aeroplane;

/*
Singleton Class
*/

public class AirTrafficControllerUSA implements AirTrafficController {
	
	private static AirTrafficControllerUSA instance;
	
	private AirTrafficControllerUSA (){
		
	}
	
	public static AirTrafficControllerUSA getInstance(){
		
		if (instance == null){
			
			 instance = new AirTrafficControllerUSA();
		}
		
		return instance;
		
	}

    @Override
	public void getFlightLocation(Aeroplane plane) {
		// TODO Auto-generated method stub
		
	}


	public void sendWeatherReportToFlight(Aeroplane plane) {
		// TODO Auto-generated method stub
		
	}
	


	
	

}
