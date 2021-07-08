package designPattern.builder.builders;

import designPattern.builder.cars.SportCar;
import designPattern.builder.components.CarType;
import designPattern.builder.components.Engine;
import designPattern.builder.components.Transmission;
import lombok.Getter;

public class SportCarBuilder implements IBuilder {
	
	@Getter
	private CarType carType;
	
	@Getter
	private int seats;
	
	@Getter
	private Transmission transmission;
	
	@Getter
	private Engine engine;
	
	@Getter
	private String color;

	@Override
	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	@Override
	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}
	
	public SportCar getResult () {
		return new SportCar(carType, seats, engine, transmission, color);
	}

}
