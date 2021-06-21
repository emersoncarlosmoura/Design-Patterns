package padroesDeProjeto.solid.ocp;

import org.junit.Assert;
import org.junit.Test;

public class Main {

	@Test
	public void producingACar () {
		Car car = new Car("Azul", "2022", 2.6, 4);
		Assert.assertNotNull(car);
	}
	
	@Test
	public void producingAMotocycle () {
		Motocycle motorcycle = new Motocycle("Branca", "2022", 250.0);
		Assert.assertNotNull(motorcycle);
	}

}
