package designPattern.abstractfactory.factories;

import designPattern.abstractfactory.aircrafts.Airplane;
import designPattern.abstractfactory.aircrafts.IAircraft;
import designPattern.abstractfactory.boats.Boat;
import designPattern.abstractfactory.boats.IBoat;
import designPattern.abstractfactory.landvehicles.Car;
import designPattern.abstractfactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory {

	@Override
	public ILandVehicle createTransportVehicle() {
		return new Car();
	}

	@Override
	public IAircraft createTransportAircraft() {
		return new Airplane();
	}

	@Override
	public IBoat createTransportBoat() {
		return new Boat();
	}

}
