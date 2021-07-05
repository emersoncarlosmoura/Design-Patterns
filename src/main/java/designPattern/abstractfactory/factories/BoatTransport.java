package designPattern.abstractfactory.factories;

import designPattern.abstractfactory.aircrafts.IAircraft;
import designPattern.abstractfactory.boats.Boat;
import designPattern.abstractfactory.boats.IBoat;
import designPattern.abstractfactory.landvehicles.ILandVehicle;

public class BoatTransport implements ITransportFactory {

	@Override
	public ILandVehicle createTransportVehicle() {
		return null;
	}

	@Override
	public IAircraft createTransportAircraft() {
		return null;
	}

	@Override
	public IBoat createTransportBoat() {
		return new Boat();
	}

}
