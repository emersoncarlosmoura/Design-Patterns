package designPattern.solid.isp;

import org.junit.Assert;
import org.junit.Test;

import designPattern.solid.isp.vehicles.Car;
import designPattern.solid.isp.vehicles.Motocycle;

public class MainIsp {
	
	@Test
	public void producingACar () {
		Car car = new Car("Azul", "2021", 2.0, 4);
		Assert.assertNotNull(car);
	}
	
	@Test
	public void producingAMotocycle () {
		Motocycle motocycle = new Motocycle("Vermelha", "2020", 250.0);
		Assert.assertNotNull(motocycle);
	}

}
