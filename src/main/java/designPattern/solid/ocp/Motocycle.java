package designPattern.solid.ocp;

import lombok.Getter;
import lombok.Setter;

public class Motocycle implements IMotocycle {
	
	@Getter @Setter
	private String color;
	
	@Getter @Setter
	private String year;
	
	@Getter @Setter
	private Double engine;

	public Motocycle (String color, String year, Double engine) {
		configureMotocycle(color, year, engine);
	}

	@Override
	public void configureMotocycle(String color, String year, Double engine) {
		this.color = color;
		this.year = year;
		this.engine = engine;
		
		System.out.println("Criando uma moto com Interface: " +color+ " "+ engine);
		startMotocycle();
	}

	@Override
	public void startMotocycle() {
		System.out.println("Ligando os motores com Interface");
		
	}

}
