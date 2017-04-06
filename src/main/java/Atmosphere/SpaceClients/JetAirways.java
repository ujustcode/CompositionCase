package Atmosphere.SpaceClients;

import Atmospehere.AeroSpace.AirTrafficControllerCA;
import Atmospehere.AeroSpace.AirTrafficControllerNJ;
import Atmospehere.AeroSpace.AirTrafficControllerUSA;
import Atmosphere.FlyingVehicles.Aeroplane;

public class JetAirways {
	
	// USA AirTraffic Controller - Singleton Object
	public static final AirTrafficControllerUSA usa = AirTrafficControllerUSA.getInstance(); 
	// California AirTraffic Controller - Singleton Object
	public static final AirTrafficControllerCA  ca = AirTrafficControllerCA.getInstance(usa);
	// New Jersey AirTraffic Controller - Singleton Object
	public static final AirTrafficControllerNJ nj = AirTrafficControllerNJ.getInstance(usa);  
	
	public static final Aeroplane plane = new Aeroplane();
	

	
	public static void main (String [] args){
	
          plane.setAirTrafficController(nj);
          plane.TakeOff();
          plane.setAirTrafficController(usa);
          plane.Fly("New Jersey","San Diego");
          plane.Land();
		         
		
	}

}
