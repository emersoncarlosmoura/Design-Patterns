package designPattern.abstractfactory.app;

import designPattern.abstractfactory.aircrafts.IAircraft;
import designPattern.abstractfactory.boats.IBoat;
import designPattern.abstractfactory.factories.ITransportFactory;
import designPattern.abstractfactory.landvehicles.ILandVehicle;
import lombok.Getter;
import lombok.Setter;

public class Application {
	
	@Getter @Setter
	private ILandVehicle vehicle;
	
	@Getter @Setter
	private IAircraft aircraft;
	
	@Getter @Setter
	private IBoat boat;
	
	public Application (ITransportFactory factory) {
		vehicle = factory.createTransportVehicle();
		aircraft = factory.createTransportAircraft();
		boat = factory.createTransportBoat();
	}
	
	public void startRoute() {
		if (vehicle != null) {
			vehicle.startRoute();
		}
		if (aircraft != null) {
			aircraft.startRoute();
		}
		boat.startRoute();
	}

}
