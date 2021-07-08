package designPattern.builder;

import org.junit.Test;

import designPattern.builder.builders.CarBuilder;
import designPattern.builder.builders.SportCarBuilder;
import designPattern.builder.builders.TruckBuilder;
import designPattern.builder.cars.Car;
import designPattern.builder.cars.SportCar;
import designPattern.builder.cars.Truck;
import designPattern.builder.director.Director;

public class MainBuilder {
	
	@Test
	public void reatingCar () {
		Director director = new Director();
		
		//criando o carro
		CarBuilder builder = new CarBuilder();
		director.constructSedanCar(builder);
		
		Car car = builder.getResult();
		System.out.println(car.getCarType() + " produzido com sucesso!");
	}
	
	public void creatingTrunck () {
		Director director = new Director();
		
		//criando um caminhão
		TruckBuilder truckBuilder = new TruckBuilder();
		director.constructTruck(truckBuilder);
				
		Truck truck = truckBuilder.getResult();
		System.out.println("Caminhão: " + truck.result());
	}
	
	@Test
	public void creatingSportCar () {
		Director director = new Director();
		
		//criando um carro sport
		SportCarBuilder builder = new SportCarBuilder();
		director.constructSportCar(builder);
		
		SportCar sportCar = builder.getResult();
		System.out.println("Carro Sport: " + sportCar.result());
	}

}
