package Atmospehere.AeroSpace;

import Atmosphere.FlyingVehicles.Aeroplane;

public interface TowerCommunications {

	
	void sendWeatherReportToFlight(Aeroplane plane);

	void getFlightLocation(Aeroplane plane);
}
