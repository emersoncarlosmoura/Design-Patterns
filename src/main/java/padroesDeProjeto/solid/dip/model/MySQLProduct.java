package padroesDeProjeto.solid.dip.model;

public class MySQLProduct implements IDbProduct {

	@Override
	public String getProductById(String productId) {
		return "MySql: Exibindo dados do produto: " + productId;
	}

}
