package designPattern.abstractfactory.aircrafts;

public class Helicopter implements IAircraft {
	
	@Override
	public void startRoute() {
		wind();
		getCargo();
		System.out.println("Iniciando a decolagem");
	}

	@Override
	public void getCargo() {
		System.out.println("Passageiros ok, Ligando Hélices");
	}

	@Override
	public void wind() {
		System.out.println("Ventos 25km, Suldeste, ventos ok");
	}

}
