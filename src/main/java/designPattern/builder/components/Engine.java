package designPattern.builder.components;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Engine {
	
	@Getter
	@Setter
	private int power;
	
	public Engine(int power) {
		this.power = power;
	}
	
}
