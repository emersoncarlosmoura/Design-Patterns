package padroesDeProjeto.solid.dip.payment;

import padroesDeProjeto.solid.dip.factory.DBProdutcFactory;
import padroesDeProjeto.solid.dip.model.DB;
import padroesDeProjeto.solid.dip.model.IDbProduct;

public class Payment {
	
	public void pay (String productID, DB type) {
		
		IDbProduct dbProduct = DBProdutcFactory.create(type);
		String product = dbProduct.getProductById(productID);
		System.out.println(product);
	}

}
