package designPattern.bridge.platforms;

public class DisneyPlus implements Iplataform {
	
	public DisneyPlus() {
		configureRMTP();
		System.out.println("DisneyPlus: Transmissão iniciada");
	}

	@Override
	public void configureRMTP() {
		authToken();
		System.out.println("DisneyPlus: configurando RMTP");
	}

	@Override
	public void authToken() {
		System.out.println("DisneyPlus: Validando o canal");
	}

}
