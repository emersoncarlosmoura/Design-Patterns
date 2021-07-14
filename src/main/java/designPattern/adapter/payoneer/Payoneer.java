package designPattern.adapter.payoneer;

import designPattern.adapter.utils.Token;
import lombok.Getter;

public class Payoneer implements IPayoneerPayments {

	@Getter
	private Token token;
	
	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void sendPayment() {
		this.token = authToken();
		System.out.println("Enviando pagamentos via Payonner");
	}

	@Override
	public void recievePayment() {
		System.out.println("Recebedo pagamentos via Payonner");
	}

}
