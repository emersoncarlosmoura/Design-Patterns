package designPattern.solid.dip.model;

public class OracleProduct implements IDbProduct {

	@Override
	public String getProductById(String productId) {
		return "Oracle: Exibindo dados do produto: " + productId;
	}

}
