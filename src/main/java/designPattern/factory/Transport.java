package designPattern.factory;

import designPattern.factory.vehicle.IVehicle;

public abstract class Transport {
	
	void startTransport () {
		IVehicle vehicle = createTransport();
		vehicle.startRote();
	}
	
	protected abstract IVehicle createTransport ();

}
