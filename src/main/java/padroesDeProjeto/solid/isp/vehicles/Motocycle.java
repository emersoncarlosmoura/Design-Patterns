package padroesDeProjeto.solid.isp.vehicles;

import lombok.Getter;
import lombok.Setter;

public class Motocycle implements IVehicle, IVehicleMotocycle {
	
	@Getter @Setter
	private String color;
	
	@Getter @Setter
	private String year;
	
	@Getter @Setter
	private Double engine;
	
	public Motocycle(String color, String year, Double engine) {
		configureMotocycle(color, year, engine);
	}

	@Override
	public void configureMotocycle(String color, String year, Double engine) {
		this.color = color;
		this.year = year;
		this.engine = engine;
		
		System.out.println("Criando uma moto: " +color+ " " +year+" " +engine);
		startVehicle();
	}

	@Override
	public void startVehicle() {
		System.out.println("Ligando os Motores!");
	}

}
