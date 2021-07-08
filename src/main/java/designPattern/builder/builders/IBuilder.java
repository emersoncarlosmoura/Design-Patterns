package designPattern.builder.builders;

import designPattern.builder.components.CarType;
import designPattern.builder.components.Engine;
import designPattern.builder.components.Transmission;

public interface IBuilder {
	
	void setCarType (CarType type);
	void setSeats (int seats);
	void setTransmission (Transmission transmission);
	void setEngine (Engine engine);
	void setColor (String color);

}
