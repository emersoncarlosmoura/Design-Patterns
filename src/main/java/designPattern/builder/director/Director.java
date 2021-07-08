package designPattern.builder.director;

import designPattern.builder.builders.IBuilder;
import designPattern.builder.components.CarType;
import designPattern.builder.components.Engine;
import designPattern.builder.components.Transmission;

public class Director {

	public void constructSedanCar (IBuilder builder) {
		builder.setCarType(CarType.SEDAN);
		builder.setSeats(5);
		builder.setTransmission(Transmission.AUTOMATIC);
		builder.setEngine(new Engine(1600));
	}
	
	public void constructTruck (IBuilder builder) {
		builder.setCarType(CarType.TRUCK);
		builder.setSeats(5);
		builder.setTransmission(Transmission.AUTOMATIC_SEQUENCIAL);
		builder.setEngine(new Engine(13000));
	}
	
	public void constructSportCar (IBuilder builder) {
		builder.setCarType(CarType.SPORTCAR);
		builder.setSeats(2);
		builder.setTransmission(Transmission.MANUAL);
		builder.setEngine(new Engine(13000));
		builder.setColor("Yellow");
	}
	
}
