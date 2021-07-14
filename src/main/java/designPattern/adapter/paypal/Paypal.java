package designPattern.adapter.paypal;

import designPattern.adapter.utils.Token;
import lombok.Getter;

public class Paypal implements IPayPalPayments {	
	
	@Getter
	private Token token;

	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void paypalPayment() {
		this.token = authToken();
		System.out.println("Enviando pagamentos via PayPal");
	}

	@Override
	public void paypalRecieve() {
		System.out.println("Recebendo pagamentos via PayPal");
	}


}
