package designPattern.builder.builders;

import designPattern.builder.cars.Truck;
import designPattern.builder.components.CarType;
import designPattern.builder.components.Engine;
import designPattern.builder.components.Transmission;
import lombok.Getter;

public class TruckBuilder implements IBuilder  {

	@Getter
	private CarType carType;
	
	@Getter
	private int seats;
	
	@Getter
	private Transmission transmission;
	
	@Getter
	private Engine engine;

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
		
	}
	
	public Truck getResult () {
		return new Truck(carType, seats, engine, transmission);
	}

}
