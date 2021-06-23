package designPattern.solid.lsp;

public class NubankRewards implements IPaymentInstrument {

	@Override
	public void validate() throws Exception {
		System.out.println("Limte Ok, Rewards Ok!");
	}

	@Override
	public void collectPayment() {
		System.out.println("Pagamento Realizado com sucesso!");
		System.out.println("Pontuação creditada no programa Rewards!");
	}

}
