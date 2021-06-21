package padroesDeProjeto.solid.dip.model;

public class SqlServerProduct implements IDbProduct {

	@Override
	public String getProductById(String productId) {
		return "SqlServer: Exibindo dados do produto: " + productId;
	}

}
