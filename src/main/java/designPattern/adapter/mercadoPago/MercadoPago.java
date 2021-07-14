package designPattern.adapter.mercadoPago;

import designPattern.adapter.utils.Token;
import lombok.Getter;

public class MercadoPago implements IMercadoPagoPayments {

	@Getter
	private Token token; 
	
	@Override
	public Token authToken() {
		return new Token();
	}

	@Override
	public void sendPayment() {
		this.token = authToken();
		System.out.println("Pagamento enviado via Mercado Pago");
	}

	@Override
	public void recievePayment() {
		System.out.println("Pagamento recebido via Mercado Pago");
	}

}
