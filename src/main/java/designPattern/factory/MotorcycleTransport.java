package designPattern.factory;

import designPattern.factory.vehicle.IVehicle;
import designPattern.factory.vehicle.Motorcycle;

public class MotorcycleTransport extends Transport {

	@Override
	protected IVehicle createTransport() {
		return new Motorcycle();
	}

}
