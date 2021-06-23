package designPattern.solid.dip.model;

public class PostgreProduct implements IDbProduct {

	@Override
	public String getProductById(String productId) {
		return "PostgreSQL: Exibindo dados do produto: " + productId;
	}

}
