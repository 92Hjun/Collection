package sample5;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class QueryUtil {
	
	private static Properties prop;
	
	public static String gerSql(String key) {
		try{
			if(prop == null) {
				prop = new Properties();
				prop.load(new FileReader("src/sample5/sql.porperties"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		String sql = prop.getProperty(key);
		
		return sql;
	}
}
