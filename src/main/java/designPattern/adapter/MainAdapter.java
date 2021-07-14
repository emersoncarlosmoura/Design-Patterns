package designPattern.adapter;

import org.junit.Test;

import designPattern.adapter.adapters.MercadoPagoAdapter;
import designPattern.adapter.adapters.PayoneerAdapter;
import designPattern.adapter.mercadoPago.MercadoPago;
import designPattern.adapter.payoneer.Payoneer;
import designPattern.adapter.paypal.IPayPalPayments;
import designPattern.adapter.paypal.Paypal;

public class MainAdapter {
	
	@Test
	public void paypal () {
		IPayPalPayments payment = new Paypal();
		payment.paypalPayment();
		payment.paypalRecieve();
	}
	
	@Test
	public void payonnerAdapter () {
		IPayPalPayments payment = new PayoneerAdapter(new Payoneer());
		payment.paypalPayment();
		payment.paypalRecieve();
	}
	
	@Test
	public void mercadoPagoAdapter () {
		IPayPalPayments payment = new MercadoPagoAdapter(new MercadoPago());
		payment.paypalPayment();
		payment.paypalRecieve();
	}

}
