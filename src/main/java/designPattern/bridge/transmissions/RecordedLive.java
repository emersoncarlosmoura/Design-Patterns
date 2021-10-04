package designPattern.bridge.transmissions;

import designPattern.bridge.platforms.Iplataform;

public class RecordedLive extends Live {
	
	public RecordedLive (Iplataform plataform) {
		super.platform = plataform;
	}
	
	public void record () {
		System.out.println("Gravação feita!");
	}

}
