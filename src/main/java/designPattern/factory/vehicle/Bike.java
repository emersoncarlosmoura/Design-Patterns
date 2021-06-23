package designPattern.factory.vehicle;

public class Bike implements IVehicle {

	@Override
	public void startRote() {
		getCargo();
		System.out.println("Iniciando o Delivery");
	}

	@Override
	public void getCargo() {
		System.out.println("Já pegamos a comida");
	}

}
