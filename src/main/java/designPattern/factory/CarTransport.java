package designPattern.factory;

import designPattern.factory.vehicle.Car;
import designPattern.factory.vehicle.IVehicle;

public class CarTransport extends Transport {

	@Override
	protected IVehicle createTransport() {
		return new Car();
	}

}
