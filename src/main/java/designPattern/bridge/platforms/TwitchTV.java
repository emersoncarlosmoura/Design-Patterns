package designPattern.bridge.platforms;

public class TwitchTV implements Iplataform {
	
	public TwitchTV() {
		configureRMTP();
		System.out.println("TwitchTV: Transmissão iniciada");
	}
	
	@Override
	public void configureRMTP() {
		authToken();
		System.out.println("TwitchTV: configurando RMTP");
	}

	@Override
	public void authToken() {
		System.out.println("TwitchTV: Validando o canal");
	}

}
