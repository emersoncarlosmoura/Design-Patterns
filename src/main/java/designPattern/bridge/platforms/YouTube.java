package designPattern.bridge.platforms;

public class YouTube implements Iplataform {
	
	public YouTube() {
		configureRMTP();
		System.out.println("YouTube: Transmissão iniciada");
	}
	
	@Override
	public void configureRMTP() {
		authToken();
		System.out.println("YouTube: configurando broadcasting");
	}

	@Override
	public void authToken() {
		System.out.println("YouTube: Autorizando aplicação");
	}

}
