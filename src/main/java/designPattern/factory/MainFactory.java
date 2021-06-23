package designPattern.factory;

import org.junit.Test;

public class MainFactory {
	
	private static Transport transport;

	@Test
	public void testFactoryMethod () {
		String type = "uber";
		configure(type);
		if (transport != null) {
			runTransport();
		}
	}

	private static void runTransport() {
		transport.startTransport();
	}

	private static void configure(String type) {
		switch (type) {
		case "uber":
			transport = new CarTransport();
			break;
		case "log":
			transport = new MotorcycleTransport();
			break;
		case "eats":
			transport = new BikeTransport();
			break;
		default :
			System.out.println("Selecione um tipo de entrega");
		}
	}

}
