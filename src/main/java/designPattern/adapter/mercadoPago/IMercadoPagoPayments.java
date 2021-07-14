package designPattern.adapter.mercadoPago;

import designPattern.adapter.utils.Token;

public interface IMercadoPagoPayments {
	
	Token authToken();
	void sendPayment();
	void recievePayment();

}
