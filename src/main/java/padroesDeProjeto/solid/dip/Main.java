package padroesDeProjeto.solid.dip;

import org.junit.Assert;
import org.junit.Test;

import padroesDeProjeto.solid.dip.model.DB;
import padroesDeProjeto.solid.dip.payment.Payment;

public class Main {

	@Test
	public void testing () {
		Payment payment = new Payment();
		payment.pay("250", DB.ORACLE);
		
		Assert.assertNotNull(payment);
	}

}
