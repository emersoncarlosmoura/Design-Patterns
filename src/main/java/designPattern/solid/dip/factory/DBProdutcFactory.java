package designPattern.solid.dip.factory;

import designPattern.solid.dip.model.DB;
import designPattern.solid.dip.model.IDbProduct;
import designPattern.solid.dip.model.MongoDBProduct;
import designPattern.solid.dip.model.MySQLProduct;
import designPattern.solid.dip.model.OracleProduct;
import designPattern.solid.dip.model.PostgreProduct;
import designPattern.solid.dip.model.SqlServerProduct;

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
