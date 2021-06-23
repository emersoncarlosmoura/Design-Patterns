package designPattern.factory.vehicle;

public class Motorcycle implements IVehicle {

	@Override
	public void startRote() {
		getCargo();
		System.out.println("Iniciando a entrega");
	}

	@Override
	public void getCargo() {
		System.out.println("Já pegamos a encomenda");
	}

}
