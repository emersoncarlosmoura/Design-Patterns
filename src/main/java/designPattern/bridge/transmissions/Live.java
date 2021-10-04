package designPattern.bridge.transmissions;

import designPattern.bridge.platforms.Iplataform;

public class Live implements ITransmission {

	protected Iplataform platform;
	
	public Live () {
		
	}
	
	public Live (Iplataform platform) {
		this.platform = platform;
	}

	@Override
	public void broadcasting() {
		System.out.println("Iniciando a transmissão!");
	}

	@Override
	public void result() {
		System.out.println("*** ON AIR ***");		
	}

}
