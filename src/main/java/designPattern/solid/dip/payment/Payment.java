package designPattern.solid.dip.payment;

import designPattern.solid.dip.factory.DBProdutcFactory;
import designPattern.solid.dip.model.DB;
import designPattern.solid.dip.model.IDbProduct;

public class Payment {
	
	public void pay (String productID, DB type) {
		
		IDbProduct dbProduct = DBProdutcFactory.create(type);
		String product = dbProduct.getProductById(productID);
		System.out.println(product);
	}

}
