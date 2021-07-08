package designPattern.builder.cars;

import designPattern.builder.components.CarType;
import designPattern.builder.components.Engine;
import designPattern.builder.components.Transmission;
import lombok.Getter;

public class SportCar {
	
	@Getter
	private CarType carType;
	
	@Getter
	private int seats;
	
	@Getter
	private Engine engine;
	
	@Getter
	private Transmission transmission;
	
	@Getter
	private String color;

	public SportCar (CarType carType, int seats, Engine engine, Transmission transmission, String color) {
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.color = color;
	}
	
	public String result () {
		return "Type: " + getCarType() + " Seats: " + getSeats() + " Enginer: " + getEngine() + " Color: " + getColor();
	}

}
