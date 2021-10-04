package designPattern.bridge;

import org.junit.Test;

import designPattern.bridge.platforms.DisneyPlus;
import designPattern.bridge.platforms.Facebook;
import designPattern.bridge.platforms.Iplataform;
import designPattern.bridge.platforms.TwitchTV;
import designPattern.bridge.platforms.YouTube;
import designPattern.bridge.transmissions.AdvancedLive;
import designPattern.bridge.transmissions.Live;
import designPattern.bridge.transmissions.RecordedLive;

public class MainBridge {
	
	@Test
	public void startLiveTest () {
		// live
		startLive(new YouTube());
		startLive(new Facebook());
		startLive(new TwitchTV());
		startLive(new DisneyPlus());
		
		// Advanced Live
		startAdvancedLive(new YouTube());
		startAdvancedLive(new Facebook());
		startAdvancedLive(new TwitchTV());
		startAdvancedLive(new DisneyPlus());
		
		// record
		record(new YouTube());
		record(new Facebook());
		record(new TwitchTV());
		record(new DisneyPlus());
	}
	
	public static void startLive (Iplataform plataform) {
		System.out.println("... Aguarde!");
		Live live = new Live(plataform);
		live.broadcasting();
		live.result();
	}
	
	public static void startAdvancedLive (Iplataform plataform) {
		System.out.println("Transmissão avançada... Aguarde!");
		AdvancedLive advancedLive = new AdvancedLive(plataform);
		advancedLive.broadcasting();
		advancedLive.comments();
		advancedLive.subtitles();
		advancedLive.result();
	}
	
	public void record (Iplataform plataform) {
		System.out.println("... Aguarde!");
		RecordedLive recordedLive = new RecordedLive(plataform);
		recordedLive.broadcasting();
		recordedLive.result();
		recordedLive.record();
	}

}
