package ProgrammingPractices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class PropertiesDemo1 {
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		FileInputStream fos = new FileInputStream("C:\\Users\\Himal Pant\\Desktop\\Education\\db.xml");
		p.load(fos);
		String url = p.getProperty("url");
		String user = p.getProperty("user");
		String pwd = p.getProperty("Password");
		Connection con = DriverManager.getConnection(url, user, pwd);
		
	}

}
