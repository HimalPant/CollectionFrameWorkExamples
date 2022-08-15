package ProgrammingPractices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Himal Pant\\Desktop\\Education\\himal.xml ");
		p.load(fis);
		System.out.println(p);
		String s = p.getProperty("Himal");
		System.out.println(s);
		p.setProperty("Mukesh", "9797");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Himal Pant\\Desktop\\Education\\himal.xml ");
		p.store(fos, "Updated By Himal Pant");
	}

}
