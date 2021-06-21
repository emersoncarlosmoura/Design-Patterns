package padroesDeProjeto.solid.lsp;

public class CreditCard extends NubankCard {

	@Override
	public void validate() throws Exception {
		System.out.println("Validando Limite!");
		System.out.println("Limite ok!");
	}
	
}
