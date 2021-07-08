package designPattern.builder.cars;

import designPattern.builder.components.CarType;
import designPattern.builder.components.Engine;
import designPattern.builder.components.Transmission;
import lombok.Getter;

public class Car {
	
	@Getter
	private final CarType carType;
	
	@Getter
	private final int seats;
	
	@Getter
	private final Engine engine;
	
	@Getter
	private final Transmission transmission;

	public Car (CarType carType, int seats, Engine engine, Transmission transmission) {
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
	}

}
