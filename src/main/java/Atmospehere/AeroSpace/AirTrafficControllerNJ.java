package Atmospehere.AeroSpace;

import Atmosphere.FlyingVehicles.Aeroplane;

/*
Singleton Class
*/

public class AirTrafficControllerNJ implements AirTrafficController {
	
	private static AirTrafficControllerNJ instance;
	private static AirTrafficControllerUSA master;
	
	private AirTrafficControllerNJ (){
		
	}
	
	public static AirTrafficControllerNJ getInstance(AirTrafficControllerUSA masterController){
		
		if (instance == null){
			 master = masterController;
			 instance = new AirTrafficControllerNJ();
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
