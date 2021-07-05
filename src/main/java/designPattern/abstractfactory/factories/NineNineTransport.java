package designPattern.abstractfactory.factories;

import designPattern.abstractfactory.aircrafts.Helicopter;
import designPattern.abstractfactory.aircrafts.IAircraft;
import designPattern.abstractfactory.boats.Boat;
import designPattern.abstractfactory.boats.IBoat;
import designPattern.abstractfactory.landvehicles.ILandVehicle;
import designPattern.abstractfactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory {

	@Override
	public ILandVehicle createTransportVehicle() {
		return new Motorcycle();
	}

	@Override
	public IAircraft createTransportAircraft() {
		return new Helicopter();
	}

	@Override
	public IBoat createTransportBoat() {
		return new Boat();
	}

}
