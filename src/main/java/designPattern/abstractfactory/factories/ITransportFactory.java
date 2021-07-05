package designPattern.abstractfactory.factories;

import designPattern.abstractfactory.aircrafts.IAircraft;
import designPattern.abstractfactory.boats.IBoat;
import designPattern.abstractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {
	
	ILandVehicle createTransportVehicle ();
	IAircraft createTransportAircraft ();
	IBoat createTransportBoat ();
	
}
