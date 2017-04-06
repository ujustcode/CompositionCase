package Atmospehere.AeroSpace;

import Atmosphere.FlyingVehicles.Aeroplane;

/*
 Singleton Class
*/


public class AirTrafficControllerCA implements AirTrafficController {
	
	private static AirTrafficControllerCA instance;
	
	private static AirTrafficControllerUSA master;
	
	private   AirTrafficControllerCA (){
		
	}
	
	public static AirTrafficControllerCA getInstance(AirTrafficControllerUSA centralController){
		
		if (instance == null){
			 master= centralController;
			 instance = new AirTrafficControllerCA();
		}
		
		return instance;
		
	}

	@Override
	public void getFlightLocation(Aeroplane plane) {
		// TODO Auto-generated method stub
		master.getFlightLocation(plane);
	}

	@Override
	public void sendWeatherReportToFlight(Aeroplane plane) {
		// TODO Auto-generated method stub
		master.sendWeatherReportToFlight(plane);
		
	}
	
	

}
