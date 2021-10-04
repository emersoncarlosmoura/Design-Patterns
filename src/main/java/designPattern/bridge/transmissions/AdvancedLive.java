package designPattern.bridge.transmissions;

import designPattern.bridge.platforms.Iplataform;

public class AdvancedLive extends Live {

	public AdvancedLive(Iplataform platform) {
		super.platform = platform;
	}
	
	public void subtitles () {
		System.out.println("Legendas ativadas na transmissão");
	}
	
	public void comments () {
		System.out.println("Comentários liberados na live");
	}
	
}
