package designPattern.adapter.paypal;

import designPattern.adapter.utils.Token;

public interface IPayPalPayments {
	
	Token authToken();
	void paypalPayment();
	void paypalRecieve();

}
