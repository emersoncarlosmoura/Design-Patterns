package designPattern.factory;

import designPattern.factory.vehicle.Bike;
import designPattern.factory.vehicle.IVehicle;

public class BikeTransport extends Transport {

	@Override
	protected IVehicle createTransport() {
		return new Bike();
	}

}
