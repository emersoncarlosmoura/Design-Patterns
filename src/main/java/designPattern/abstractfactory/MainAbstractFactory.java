package designPattern.abstractfactory;

import org.junit.Test;

import designPattern.abstractfactory.app.Application;
import designPattern.abstractfactory.factories.BoatTransport;
import designPattern.abstractfactory.factories.ITransportFactory;
import designPattern.abstractfactory.factories.NineNineTransport;
import designPattern.abstractfactory.factories.UberTransport;

public class MainAbstractFactory {
	
	public static Application configuraApplication (String company) {
		Application app;
		ITransportFactory factory;
		
		if (company.equals("uber")) {
			factory = new UberTransport();
		} else if (company.equals("ninenine")) {
			factory = new NineNineTransport();
		} else {
			factory = new BoatTransport();
		}
		
		app = new Application(factory);
		
		return app;
	}
	
	@Test
	public void teste () {
		String company = "uber";
		Application app = configuraApplication(company);
		app.startRoute();
	}
	
}
