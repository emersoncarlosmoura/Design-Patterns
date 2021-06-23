package designPattern.solid.ocp;

import lombok.Getter;
import lombok.Setter;

public class Car implements ICar {
	
	@Getter @Setter
	private String color;
	
	@Getter @Setter
	private String year;
	
	@Getter @Setter
	private Double engine;

	@Getter @Setter
	private Integer seats;
	
	public Car (String color, String year, Double engine, Integer seats) {
		configureCar(color, year, engine, seats);
	}

	@Override
	public void configureCar(String color, String year, Double engine, Integer seats) {
		this.color = color;
		this.year = year;
		this.engine = engine;
		this.seats = seats;
		
		System.out.println("Criando um carro com Interface: " +color+ " "+ engine);
		startCar();
	}

	@Override
	public void startCar() {
		System.out.println("Ligando os motores com Interface");
		
	}

}
