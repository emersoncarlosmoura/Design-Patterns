package designPattern.solid.dip;

import org.junit.Assert;
import org.junit.Test;

import designPattern.solid.dip.model.DB;
import designPattern.solid.dip.payment.Payment;

public class MainDip {

	@Test
	public void testing () {
		Payment payment = new Payment();
		payment.pay("250", DB.ORACLE);
		
		Assert.assertNotNull(payment);
	}

}
