package padroesDeProjeto.solid.dip.factory;

import padroesDeProjeto.solid.dip.model.DB;
import padroesDeProjeto.solid.dip.model.IDbProduct;
import padroesDeProjeto.solid.dip.model.MongoDBProduct;
import padroesDeProjeto.solid.dip.model.MySQLProduct;
import padroesDeProjeto.solid.dip.model.OracleProduct;
import padroesDeProjeto.solid.dip.model.PostgreProduct;
import padroesDeProjeto.solid.dip.model.SqlServerProduct;

public class DBProdutcFactory {
	
	public static IDbProduct create (DB type) {
		if (type.equals(DB.MYSQL)) {
			return new MySQLProduct();
		} else if (type.equals(DB.MOGODB)) {
			return new MongoDBProduct();
		} else if (type.equals(DB.ORACLE)) {
			return new OracleProduct();
		} else if (type.equals(DB.POSTGRESQL)) {
			return new PostgreProduct();
		} else {
			return new SqlServerProduct();
		}
	} 

}
