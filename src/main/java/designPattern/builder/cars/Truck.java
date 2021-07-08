package designPattern.builder.cars;

import designPattern.builder.components.CarType;
import designPattern.builder.components.Engine;
import designPattern.builder.components.Transmission;
import lombok.Getter;

public class Truck {
	
	@Getter
	private final CarType carType;
	
	@Getter
	private final int seats;
	
	@Getter
	private final Engine engine;
	
	@Getter
	private final Transmission transmission;
	
	public Truck (CarType carType, int seats, Engine engine, Transmission transmission) {
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
	}
	
	public String result () {
		String truck = "Truck with motor: " + engine.getPower() + "\n";
		truck += "Transmission: " + transmission;
		
		return truck;
	}

}
