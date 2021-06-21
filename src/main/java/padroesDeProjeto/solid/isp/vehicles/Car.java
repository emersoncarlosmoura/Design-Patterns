package padroesDeProjeto.solid.isp.vehicles;

import lombok.Getter;
import lombok.Setter;

public class Car implements IVehicle, IVehicleCar {
	
	@Getter @Setter
	private String color;
	
	@Getter @Setter
	private String year;
	
	@Getter @Setter
	private Double engine;

	@Getter @Setter
	private Integer seats;
	
	public Car(String color, String year, Double engine, Integer seats) {
		configureCar(color, year, engine, seats);
	}

	@Override
	public void configureCar(String color, String year, Double engine, Integer seats) {
		this.color = color;
		this.year = year;
		this.engine = engine;
		this.seats = seats;
		
		System.out.println("Criando um carro: " +color+ " " +year+" " +engine+ " " +seats);
		startVehicle();
	}

	@Override
	public void startVehicle() {
		System.out.println("Ligando os Motores!");
	}

}
