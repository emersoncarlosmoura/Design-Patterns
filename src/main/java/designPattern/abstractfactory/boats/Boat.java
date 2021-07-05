package designPattern.abstractfactory.boats;

public class Boat implements IBoat {

	@Override
	public void startRoute() {
		getCargo();
		System.out.println("Iniciando a viajem pelo atlantico");
	}

	@Override
	public void getCargo() {
		System.out.println("Os passageiros já embarcaram, estamos prontos");
	}
	
}
