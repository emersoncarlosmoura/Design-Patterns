package designPattern.adapter.adapters;

import designPattern.adapter.payoneer.Payoneer;
import designPattern.adapter.paypal.IPayPalPayments;
import designPattern.adapter.utils.Token;
import lombok.Getter;

public class PayoneerAdapter implements IPayPalPayments {
	
	@Getter
	private Token token;
	
	private Payoneer payonner;
	
	public PayoneerAdapter(Payoneer payonner) {
		this.payonner = payonner;
		System.out.println("Adaptando o Payonner utilizando os metodos padrões do PayPal");
	}

	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void paypalPayment() {
		this.payonner.sendPayment();
	}

	@Override
	public void paypalRecieve() {
		this.payonner.recievePayment();
	}

}
