package padroesDeProjeto.solid.dip.model;

public class MongoDBProduct implements IDbProduct {

	@Override
	public String getProductById(String productId) {
		return "MongoDB: Exibindo dados do produto: " + productId;
	}

}
