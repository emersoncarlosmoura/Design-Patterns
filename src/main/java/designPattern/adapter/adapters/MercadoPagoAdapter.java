package designPattern.adapter.adapters;

import designPattern.adapter.mercadoPago.MercadoPago;
import designPattern.adapter.paypal.IPayPalPayments;
import designPattern.adapter.utils.Token;
import lombok.Getter;

public class MercadoPagoAdapter implements IPayPalPayments {
	
	private MercadoPago mercadoPago;

	@Getter
	private Token token;
	
	public MercadoPagoAdapter(MercadoPago mercadoPago) {
		this.mercadoPago = mercadoPago;
		System.out.println("Adaptando o mercado Pago utilizando os metodos padrões do paypal");
	}

	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void paypalPayment() {
		this.mercadoPago.sendPayment();
	}

	@Override
	public void paypalRecieve() {
		this.mercadoPago.recievePayment();
	}

}
