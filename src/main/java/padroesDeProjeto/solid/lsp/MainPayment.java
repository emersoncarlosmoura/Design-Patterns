package padroesDeProjeto.solid.lsp;

import org.junit.Assert;
import org.junit.Test;

public class MainPayment {

	@Test
	public void testing () throws Exception {
		//CreditCard card = new CreditCard();
		//DebitCard card = new DebitCard();
		NubankRewards card = new NubankRewards();
				
		card.validate();
		card.collectPayment();
		
		Assert.assertNotNull(card);
	}

}
