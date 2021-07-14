package designPattern.adapter.payoneer;

import designPattern.adapter.utils.Token;

public interface IPayoneerPayments {
	
	Token authToken();
	void sendPayment();
	void recievePayment();

}
